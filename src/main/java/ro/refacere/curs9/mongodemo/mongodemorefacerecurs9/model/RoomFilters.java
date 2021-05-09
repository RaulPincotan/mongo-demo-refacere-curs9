package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model;

import lombok.Value;

@Value
public class RoomFilters {
    private String roomNumber;
    private Integer floor;
    private String hotelName;
}
