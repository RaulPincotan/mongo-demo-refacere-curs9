package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity.Room;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.repository.RoomDao;

@SpringBootApplication
public class MongoDemoRefacereCurs9Application {

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoRefacereCurs9Application.class, args);
    }

    @Bean
    CommandLineRunner atStartup(MongoRepository repository, RoomDao dao) {
        return args -> {
            repository.save(new Room("GF001", 0, "Melody Oradea"));
            repository.save(new Room("202A", 2, "Melody Oradea"));
            repository.save(new Room("502B", 5, "Melody Oradea"));
            repository.save(new Room("304", 3, "Melody Oradea"));
            repository.save(new Room("101", 2, "Melody Oradea"));

            System.out.println(dao.findRooms());
        };
    }

}
