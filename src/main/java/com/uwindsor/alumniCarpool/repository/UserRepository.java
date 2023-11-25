package com.uwindsor.alumniCarpool.repository;

import com.uwindsor.alumniCarpool.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'email': ?0}")
    ArrayList<User> getUserByEmail(String email);

    public User findById(int id);

    public void deleteById(int id);

    public User findByUserName(String userName);

    public User findByEmail(String eMail);
}
