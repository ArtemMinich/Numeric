package ua.numeric.authservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.numeric.authservice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String > {
}
