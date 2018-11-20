package org.fasttrackit.forum.service;


import org.fasttrackit.forum.domain.User;
import org.fasttrackit.forum.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){

        if (user.getUserName()==null){
            throw new IllegalArgumentException("User can not be null");
        }

        if (user.getLastName()== null){
            throw new IllegalArgumentException("Last name can not be null");
        }

        try {
            userRepository.save(user);
        }catch (Exception e){
            System.out.print("Error when saving user " + e);
        }
    }

}
