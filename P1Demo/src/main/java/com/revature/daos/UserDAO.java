package com.revature.daos;

import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*By extending JpaRepository, we get access to various DAO methods that we don't need to write


  */

public interface UserDAO extends JpaRepository<User, Integer> {



}
