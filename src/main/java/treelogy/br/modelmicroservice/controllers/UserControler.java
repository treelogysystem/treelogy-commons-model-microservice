package treelogy.br.modelmicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import treelogy.br.modelmicroservice.models.UserModel;
import treelogy.br.modelmicroservice.repositories.UserRepository;

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
