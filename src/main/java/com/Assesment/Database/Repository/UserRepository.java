package com.Assesment.Database.Repository;

import com.Assesment.Database.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
