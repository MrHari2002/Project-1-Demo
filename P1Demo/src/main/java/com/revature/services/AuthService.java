package com.revature.services;

import com.revature.controllers.AuthController;
import com.revature.daos.AuthDAO;
import com.revature.models.DTOs.LoginDTO;
import com.revature.models.DTOs.OutgoingUserDTO;
import com.revature.models.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthDAO authDAO;

    @Autowired
    public AuthService(AuthDAO authDAO) {
        this.authDAO = authDAO;
    }

    public OutgoingUserDTO login(LoginDTO loginDTO, HttpSession session){
        //Use the DTO to find a user in the DB by username and password
        User user = authDAO.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
        //If no user is found throw an exception
        if (user == null) {
            throw new IllegalArgumentException("Invalid username or password");
        }
        //If a user is found login was successful we initialize our session
        AuthController.session = session;

        //Store the user info in the session
        session.setAttribute("userId", user.getUserId());
        session.setAttribute("username", user.getUsername());
        session.setAttribute("role", user.getRole());

        /*
            It helps store user info that we can use to check if:
            - They are logged in
            - Their role is appropriate for the functionality they want to access
            - etc
         */

        //Process the User into an outgoing user DTO and return it
        return new OutgoingUserDTO(user.getUserId(), user.getUsername(), user.getRole());
    }


}
