package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "rooms")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {

    @Id
    private String id;
    private String roomNumber;
    private int floor;
    private String hotelName;
    private RoomFacilities roomFacilities;

    public Room(String roomNumber, int floor, String hotelName) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.hotelName = hotelName;
    }
}
