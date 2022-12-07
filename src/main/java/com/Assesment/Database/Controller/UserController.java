package com.Assesment.Database.Controller;

import com.Assesment.Database.Exception.RecordNotFoundException;
import com.Assesment.Database.Model.User;
import com.Assesment.Database.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> list = service.getAllUsers();

        return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id)
            throws RecordNotFoundException {
        User entity = service.getUserById(id);

        return new ResponseEntity<User>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser( @RequestBody User myItem){
        User created = service.createUser(myItem);
        return new ResponseEntity<User>(created, new HttpHeaders(), HttpStatus.OK);
    }
}
