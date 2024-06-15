package ua.numeric.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.numeric.userservice.entity.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {

}
