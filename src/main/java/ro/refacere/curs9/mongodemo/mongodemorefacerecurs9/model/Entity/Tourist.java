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
public class Tourist {

    @Id
    private String name;
    private int age;
    private String address;
}
