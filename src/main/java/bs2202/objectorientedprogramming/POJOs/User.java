package bs2202.objectorientedprogramming.POJOs;

public class User {
    public String firstName;
    public String surName;
    public String username;
    public String password;
    public boolean admin;

    public User(String firstName, String surName, String username, String password){
        this.firstName = firstName;
        this.surName = surName;
        this.username = (firstName + "_" + surName);
        this.password = password;
        this.admin = false;
    }
}


