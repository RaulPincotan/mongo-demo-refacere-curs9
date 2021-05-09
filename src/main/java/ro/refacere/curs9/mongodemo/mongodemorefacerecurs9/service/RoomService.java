package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.exceptions.ResourceNotFoundException;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity.Room;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository repository;

    public List<Room> getAll(String roomNumber) {
        return Optional.ofNullable(roomNumber)
                .map(repository::findByRoomNumber)
                .orElseGet(repository::findAll);
    }

    public Room addRoom(Room newRoom) {
        return repository.save(newRoom);
    }

    public Room replaceRoom(String roomId, Room newRoom) {
        newRoom.setId(roomId);
        Room roomdb = repository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room with id " + roomId + " does not exist"));
        copyRoom(newRoom, roomdb);
        return roomdb;
    }

    private void copyRoom(Room newRoom, Room roomdb) {
        roomdb.setRoomNumber(newRoom.getRoomNumber());
        roomdb.setFloor(newRoom.getFloor());
        roomdb.setHotelName(newRoom.getHotelName());
        roomdb.setRoomFacilities(newRoom.getRoomFacilities());
    }


    public Room deleteRoom(String roomId) {
        Optional<Room> dobRoom = repository.findById(roomId);
        dobRoom.ifPresent(repository::delete);
        return dobRoom.orElseThrow(() -> new ResourceNotFoundException("Room with id " + roomId + "could not be found"));
    }
}
