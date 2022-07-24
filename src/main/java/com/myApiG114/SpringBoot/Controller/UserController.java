package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.User;
import com.myApiG114.SpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ={"http://localhost:4200/"})
public class UserController {
    @Autowired
    UserService userService;
    
    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody User user){
        return userService.login(user);
    }
    
}
