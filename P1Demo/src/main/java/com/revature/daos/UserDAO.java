package com.revature.daos;

import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*By extending JpaRepository, we get access to various DAO methods that we don't need to write

    JpaRepository takes two generics:
    -The Java Model we intend to perform DB operations with (User => users table in this case)
    -The datatype of the Primary Key field in the Model (Integer => userId in this case */
@Repository //1 of the 4 stereotype annotations. It registers this class as a Spring Bean
public interface UserDAO extends JpaRepository<User, Integer> {



}
