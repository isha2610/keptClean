package com.project.major.controller;

import com.project.major.Entity.userMetaData;
import com.project.major.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// handles all the request from the frontend!!!

@RestController
@RequestMapping("/keptClean/users/")
public class userController {
    @Autowired
    userService userservice;
    @PostMapping("saveUserDetails")
    public userMetaData saveUserDetails(@RequestBody userMetaData userData){
        userMetaData user = userservice.saveUserMetaDataToDB(userData);
        return user;
    }

    @GetMapping("getUserDetails/{userId}")
    public userMetaData getUserDetails(@PathVariable String userId){
        userMetaData user = userservice.getUserMetaDataFromDB(userId);
        return user;
    }

    @GetMapping("/test/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

}
