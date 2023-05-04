package com.project.major.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name = "User")
    public class userMetaData {

        @Id
        @GeneratedValue
        private long id;

        private String name;
    private String uniqueId;
    private String email;


    public userMetaData(long id, String name, String uniqueId, String email) {
        super();
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
    }

    public userMetaData() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}