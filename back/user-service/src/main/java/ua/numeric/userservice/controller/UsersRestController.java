package ua.numeric.userservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import ua.numeric.userservice.dto.response.UserDetailsResponse;
import ua.numeric.userservice.service.UserService;
import ua.numeric.userservice.util.UserToUserDetailsResponseConverter;

@RestController
@RequestMapping(("/api/v1/users"))
@AllArgsConstructor
public class UsersRestController {

    private UserService userService;

    @GetMapping
    public Flux<UserDetailsResponse> getUsersDetails(@RequestParam(value = "idToken",required = false) String idToken){
        return userService.findAll()
                .map(UserToUserDetailsResponseConverter::map);
    }


}
