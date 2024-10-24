package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*What is the Service layer?? It's also known as the "Business Logic Layer" because...

    -This is where we do any data processing/error handling that DOESN'T have to do with the DB or HTTP
        -DAO handles DB operations
        -Controller handles HTTP requests/responses
    -EVERYTHING in between should live in the Service layer! */

@Service //1 of the 4 stereotype annotations. It registers this Class as a Spring Bean
public class UserService {

    //We can't instantiate Interfaces like Classes... how do we get access to our DAO methods?
    //DEPENDENCY INJECTION! With the @Autowired dependency
    private UserDAO userDAO;

    //This is CONSTRUCTOR INJECTION (not setter injection, not field injection)
    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    //This method inserts new Users into the DB
    public User register(User newUser){

        //TODO: Check that the username is unique (get user by username, see if it's null)

        //Make sure the username is present in the new User (TODO: password too)
        if(newUser.getUsername() == null || newUser.getUsername().isBlank()){
            //It will be the Controller's job to handle this
            throw new IllegalArgumentException("Username cannot be empty!");
        }

        //.save() is the JPA method to insert data into the DB. We can also use this for updates
        //It also returns the saved object, so we can just return the method call. Convenient!
        return userDAO.save(newUser);
    }


    //TODO: get all users

    //TODO: get user by username (require a custom DAO method)

}
