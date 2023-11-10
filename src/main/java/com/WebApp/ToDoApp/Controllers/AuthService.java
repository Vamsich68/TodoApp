package com.WebApp.ToDoApp.Controllers;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean authenticate(String username, String password){
        boolean checkUsername= username.equalsIgnoreCase("vamsi");
        boolean checkPassword = password.equalsIgnoreCase("vamsich");
        return checkUsername && checkPassword;
    }
}
