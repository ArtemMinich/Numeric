package ua.numeric.userservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.numeric.userservice.dto.request.UserDetailsRequest;
import ua.numeric.userservice.dto.response.UserDetailsResponse;
import ua.numeric.userservice.entity.User;
import ua.numeric.userservice.repository.UserRepository;
import ua.numeric.userservice.util.UserToUserDetailsResponseConverter;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    public Mono<User> findById(String idToken) {
        return userRepository.findById(idToken);

    }

}
