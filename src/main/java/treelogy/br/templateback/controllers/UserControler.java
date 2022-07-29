package treelogy.br.templateback.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import treelogy.br.templateback.models.UserModel;
import treelogy.br.templateback.repositories.UserRepository;

@RestController
@RequestMapping("/v1")
public class UserControler implements UserController {
    private UserRepository userRepository;

    @Override
    public ResponseEntity<UserModel> getUserById(Long id) throws Exception {
        try {
            return ResponseEntity.ok(userRepository.getUserById(id));
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<UserModel> createUser(UserModel user) throws Exception {
        try {
            return ResponseEntity.ok(userRepository.save(user));
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
