package com.revature.aspects;

//This is a custom annotation
//We can use it to annotate any controllers that can only be accessed by admins

import com.revature.controllers.AuthController;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.aspectj.lang.annotation.Before;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AdminOnly {
    //No need for any fields/ methods

;
}
