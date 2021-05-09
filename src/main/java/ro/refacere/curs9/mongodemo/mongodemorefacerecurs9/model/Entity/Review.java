package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review {

    @Id
    private String id;
    private String comment;
    private int rating;
    private Tourist tourist;
    private String roomId;

}
