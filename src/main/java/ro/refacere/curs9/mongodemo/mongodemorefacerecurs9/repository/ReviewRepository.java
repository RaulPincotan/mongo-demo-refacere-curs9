package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.model.Entity.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
