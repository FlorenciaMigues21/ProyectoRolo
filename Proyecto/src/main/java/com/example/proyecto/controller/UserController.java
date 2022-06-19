package com.example.proyecto.controller;


import com.example.proyecto.model.User;
import com.example.proyecto.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {

    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("agregar")
    public void agregar(@RequestBody User user){
        this.userService.crearUsuario(user);
    }
}
