package br.treelogy.modelmicroservice.controllers;

import br.treelogy.modelmicroservice.models.UserModel;
import br.treelogy.modelmicroservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserControler implements UserController {
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<UserModel> getUserById(Long id) throws Exception {
        try {
            return ResponseEntity.ok(userRepository.getUserById(id));
        }
        catch (Exception e){
            throw new Exception("Internal server error");
        }
    }

    @Override
    public ResponseEntity<UserModel> createUser(UserModel user) throws Exception {
        try {
            return ResponseEntity.ok(userRepository.save(user));
        }
        catch (Exception e){
            throw new Exception("Internal server error");
        }
    }
}