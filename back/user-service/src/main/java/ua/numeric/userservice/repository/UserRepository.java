package ua.numeric.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.numeric.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
