package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity.Room;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.service.RoomService;

import java.util.List;

@RestController
@RequestMapping("rooms")
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public List<Room> getAll(@RequestParam(required = false) String roomNumber) {
        return roomService.getAll(roomNumber);
    }

    @PostMapping
    public Room addNewRoom(@RequestBody Room newRoom) {
        return roomService.addRoom(newRoom);
    }

    @DeleteMapping("{roomId}")
    public Room deleteRoom(@PathVariable String roomId) {
        return roomService.deleteRoom(roomId);
    }
}
