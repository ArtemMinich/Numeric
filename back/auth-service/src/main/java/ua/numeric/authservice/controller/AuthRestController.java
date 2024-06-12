package ua.numeric.authservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ua.numeric.authservice.dto.response.UserDetailsResponse;
import ua.numeric.authservice.service.UserService;

@RestController("/api/v1/auth")
@AllArgsConstructor
public class AuthRestController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getUserDetails(@RequestBody String idToken){
        UserDetailsResponse userDetailsResponse = userService.findById(idToken);
        if(userDetailsResponse == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDetailsResponse);
    }
}
