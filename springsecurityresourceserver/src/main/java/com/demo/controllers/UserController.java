package com.demo.controllers;

import com.demo.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diwakar on 21/05/17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get")
    public ResponseEntity<List<User>> getAllUsers(){
        User user = new User();
        user.setName("Dummy user 1");
        user.setAccountNumber(1234);
        User user1 = new User();
        user.setName("Dummy User 2");
        user.setAccountNumber(545645);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }

}
