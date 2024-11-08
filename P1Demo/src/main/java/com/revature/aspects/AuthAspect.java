package com.revature.aspects;

import com.revature.controllers.AuthController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //This makes a Class an ASPECT - a class that can trigger functionality at any point in our code
@Component
public class AuthAspect {

    //TERM: An advice is the functionality that an aspect can trigger

    //An advice that checks if the user is logged in before they can call UserController methods
    //EXCEPT for the registerUser method - anyone should be able to register
    @Before("execution(* com.revature.controllers.UserController.*(..)) " +
            "&& !execution(* com.revature.controllers.UserController.registerUser(..))")
    public void checkLogin() throws IllegalArgumentException{

        if(AuthController.session == null){
            throw new IllegalArgumentException("You must be logged in to do this!");
        }

        /*The Exception will not get handled appropriately...
         because this is checked before any controller method runs
         (thus the handler in the controller won't catch it)

         we could do a global exception handler with @ControllerAdvice
         we'll handle errors on the front in the exact same way. so no biggie.*/

    }

}
