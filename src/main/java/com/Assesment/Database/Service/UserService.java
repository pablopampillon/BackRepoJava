package com.Assesment.Database.Service;

import com.Assesment.Database.Exception.RecordNotFoundException;
import com.Assesment.Database.Model.User;
import com.Assesment.Database.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> getAllUsers()
    {
        List<User> UserList = repository.findAll();
        return UserList;
    }

    public User getUserById(Integer id) throws RecordNotFoundException {
        Optional<User> user = repository.findById(id);

        if(user.isPresent()) {
            return user.get();
        } else {
            throw new RecordNotFoundException("No item record exist for given id",id);
        }
    }

    public User createUser(User entity){
        entity = repository.save(entity);
        return entity;
    }


}
