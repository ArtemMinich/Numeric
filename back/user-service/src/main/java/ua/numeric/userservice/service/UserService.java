package ua.numeric.userservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.numeric.userservice.dto.response.UserDetailsResponse;
import ua.numeric.userservice.entity.User;
import ua.numeric.userservice.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDetailsResponse> findAll(){
        return userRepository.findAll().stream()
                .map(u->new UserDetailsResponse(u.getName(), u.getSurname(), u.getPatronymic(),
                        u.getRank(), u.getPosition(), u.getBirth(), u.getGroup(), u.getRole().toString()))
                .toList();
    }

    public UserDetailsResponse findById(String idToken){
        Optional<User> user = userRepository.findById(idToken);
        if(user.isPresent()){
            User userDetails = user.get();
            return new UserDetailsResponse(userDetails.getName(), userDetails.getSurname(), userDetails.getPatronymic(),
                    userDetails.getRank(), userDetails.getPosition(), userDetails.getBirth(), userDetails.getGroup(),
                    userDetails.getRole().toString());
        }
        return null;
    }
}
