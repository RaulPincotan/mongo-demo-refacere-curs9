package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cleanup {
    @Id
    private String id;

    private LocalDate date;
    private String procedure;
    private String roomId;

}
