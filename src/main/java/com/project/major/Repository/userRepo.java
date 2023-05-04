package com.project.major.Repository;


import com.project.major.Entity.userMetaData;
import org.springframework.data.repository.CrudRepository;

// this file connects to the database
public interface userRepo extends CrudRepository<userMetaData, Long> {
    userMetaData save(userMetaData userData);
    userMetaData findByUniqueId(String uniqueId);
}
