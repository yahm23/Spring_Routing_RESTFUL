package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.repositories.UserRepository;

@RestController
@RequestMapping(value ="/users")

public class UserController {

    @Autowired
    UserRepository userRepository;
}
