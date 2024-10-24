package com.revature.controllers;

import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Combines @Controller (makes a class a bean) @ResponseBody(HTTP response body -> JSON)
@RequestMapping("/users") //All HTTP Requests made to /users will hit this Controller
public class UserController {

    //We need access to the UserService - let's use Constructor Injection!
    private UserService userService;

    @Autowired //This tells Spring to dependency inject the UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //POST request to insert a new User
    @PostMapping //POST requests to /users will come here
    public ResponseEntity<User> registerUser(@RequestBody User newUser){
        //@RequestBody tells Spring to convert the JSON in the Request to a User object

        //Send the new user to the Service to be inserted, and save the returned User
        User u = userService.register(newUser);

        return ResponseEntity.ok(u); //Return the saved User with a 200 status code (200 - OK)
    }

    //TODO: get all users (call to the service)

    //TODO: get user by username (call to the service)


    //Exception Handler for IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException e){
        //Return a 400 (BAD REQUEST) status code with the exception message
        return ResponseEntity.status(400).body(e.getMessage());
    }

}
