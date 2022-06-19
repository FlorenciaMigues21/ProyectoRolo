package com.example.proyecto.services;

import com.example.proyecto.model.User;
import com.example.proyecto.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getUsers(){
        return this.userRepo.findAll();
    }

    public void crearUsuario(User user){
        User nuevo = new User(user.getName(),user.getMail(), user.getComentario());
        userRepo.save(nuevo);
    }
}
