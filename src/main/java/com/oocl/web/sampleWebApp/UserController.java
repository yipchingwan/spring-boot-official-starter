package com.oocl.web.sampleWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;


    }

    @PostMapping(path = "/{userID}", produces = {"application/json"})
    public ResponseEntity<String> getAll(@PathVariable String userID) {
        userService.addUser(new User(userID));
        return ResponseEntity.created(URI.create("/users/"+userID)).body("This is message body for "+userID);
    }

}
