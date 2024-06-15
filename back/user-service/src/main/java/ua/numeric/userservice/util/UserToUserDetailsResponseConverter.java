package ua.numeric.userservice.util;

import jakarta.persistence.Column;
import org.springframework.stereotype.Component;
import ua.numeric.userservice.dto.response.UserDetailsResponse;
import ua.numeric.userservice.entity.User;

public class UserToUserDetailsResponseConverter {
    static public UserDetailsResponse map(User user){
        return new UserDetailsResponse(user.getIdToken(), user.getName(), user.getSurname(), user.getPatronymic(),
                user.getRank(), user.getPosition(), user.getBirth(),
                user.getGroup(), user.getRole().toString());
    }
}
