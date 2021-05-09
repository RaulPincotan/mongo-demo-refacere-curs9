package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity.Room;

import java.util.List;

public interface RoomRepository extends MongoRepository<Room, String> {
    List<Room> findByRoomNumber(String roomNumber);
}
