package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.User;
import com.myApiG114.SpringBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public boolean login(User user){
    return userRepository.existsByUsuarioAndPwd(user.getUsuario(), user.getPwd());
    }
}
