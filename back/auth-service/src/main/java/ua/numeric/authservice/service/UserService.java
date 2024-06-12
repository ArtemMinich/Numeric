package ua.numeric.authservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.numeric.authservice.dto.response.UserDetailsResponse;
import ua.numeric.authservice.entity.User;
import ua.numeric.authservice.repository.UserRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDetailsResponse findById(String idToken){
        Optional<User> user = userRepository.findById(idToken);
        if(user.isPresent()){
            User userDetails = user.get();
            return new UserDetailsResponse(userDetails.getName(), userDetails.getSurname(), userDetails.getPatronymic(),
                    userDetails.getRank(), userDetails.getPosition(), userDetails.getBirth());
        }
        return null;
    }
}
