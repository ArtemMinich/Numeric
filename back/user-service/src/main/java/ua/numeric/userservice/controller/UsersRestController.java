package ua.numeric.userservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.numeric.userservice.service.UserService;

@RestController
@RequestMapping(("/api/v1/users"))
@AllArgsConstructor
public class UsersRestController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getUsersDetails(@RequestParam(value = "idToken",required = false) String idToken){
        if(idToken==null){
            return ResponseEntity.ok(userService.findAll());
        }
        return ResponseEntity.ok(userService.findById(idToken));
    }


}
