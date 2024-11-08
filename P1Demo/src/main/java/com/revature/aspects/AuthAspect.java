package com.revature.aspects;

import com.revature.controllers.AuthController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
    //Term: An advice is the functionality that an aspect can trigger
    //Except for the register user method,
    @Before("exeution(* com.revature.controllers.UserController.*(..))" +
    "&& !exeution(* com.revature.controllers.UserController.registerUser(..))")
    public void checkLogin() throws IllegalArgumentException{
        //If the user is not logged in, throw an exception
        if(AuthController.session == null){
            throw new IllegalArgumentException("You must be logged in to access this resource");
        }
    }

    /*
        The Execution will not get handled appropriately...
        because this is checked before any controller method runs
        thus the handler in the controller won't catch it
        we'll handle errors in the front end in the same way so no biggie
     */
}
