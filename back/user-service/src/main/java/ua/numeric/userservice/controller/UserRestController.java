package ua.numeric.userservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import ua.numeric.userservice.dto.response.ErrorResponse;
import ua.numeric.userservice.dto.response.UserDetailsResponse;
import ua.numeric.userservice.entity.User;
import ua.numeric.userservice.service.UserService;
import ua.numeric.userservice.util.UserToUserDetailsResponseConverter;

import java.util.NoSuchElementException;

@RestController
@RequestMapping(("/api/v1/users/{userId:\\d+}"))
@AllArgsConstructor
public class UserRestController {

    private UserService userService;

    @ModelAttribute(name = "user",binding = false)
    public Mono<User> loadUser(@PathVariable("userId") String userId){
        return userService.findById(userId)
                .switchIfEmpty(Mono.error(NoSuchElementException::new));
    }

    @GetMapping
    public Mono<UserDetailsResponse> findUserDetails(@ModelAttribute("user") User user){
        return Mono.just(user)
                .map(UserToUserDetailsResponseConverter::map);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public Mono<ErrorResponse> handlerNoSuchElementException(NoSuchElementException exception){
        return Mono.just(new ErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage()));
    }
}
