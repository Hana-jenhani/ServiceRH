package com.service.RH.service;

import com.service.RH.model.User;
import com.service.RH.model.UserInformation;
import com.service.RH.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService  {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        List<User> Users =  userRepository.findAll();
        return Users ;
    }

    @Override
    public User addUser(User u) {
        userRepository.existsByEmail(u.getEmail());
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User getUserById(long id) {
        return  userRepository.findById(id).get();
    }

    @Override
    public Boolean deleteUserById(long id) {
try {
    userRepository.delete( userRepository.findById(id).get());
    return true;
}catch (Exception e){
    return false;
}


    }


}
