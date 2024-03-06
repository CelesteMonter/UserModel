package com.example.javaform;

public class UserModel {
     String name;
     String lastname;
     String username;
     String email;

     String cellphone;
     String password;


     UserModel(String name, String lastname, String username, String email, String cellphone, String password) {
         this.name = name;
         this.lastname = lastname;
         this.username = username;
         this.email = email;
         this.cellphone = cellphone;
         this.password = password;
    }

    String getName() {return name;}

    String getLastname() {return lastname;}

    String getUsername() {return username;}

    String getEmail() {return email;}

    String getPassword() {return password;}

}

