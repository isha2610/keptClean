package com.project.major.Services;


import com.project.major.Entity.userMetaData;
import com.project.major.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// this file handles business logic
@Service
public class userService {
    @Autowired
    userRepo userrepo;

    // submit the data to the database
    public userMetaData saveUserMetaDataToDB(userMetaData metaData){
        return userrepo.save(metaData);
    }

    // retrieve the data from the database
    public userMetaData getUserMetaDataFromDB(String userId){

        return userrepo.findByUniqueId(userId);
    }

}
