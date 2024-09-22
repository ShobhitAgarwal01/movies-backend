package dev.shobhit.movies.repository;

import dev.shobhit.movies.dto.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
