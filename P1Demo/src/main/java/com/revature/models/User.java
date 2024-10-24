package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component //This Class will be registered as a Spring Bean
@Entity //This Class will be created as a table in the DB (In other words, a DB ENTITY)
@Table(name = "users") //@Table lets us set properties like table name. THIS IS NOT WHAT MAKES IT A TABLE
public class User {



}
