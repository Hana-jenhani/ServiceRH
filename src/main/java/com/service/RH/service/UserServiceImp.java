package com.service.RH.service;

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
    public List<UserInformation> findAllUser() {
        List<UserInformation> Users =  userRepository.findAll();
        return Users ;
    }

    @Override
    public UserInformation addUser(UserInformation u) {
        return userRepository.save(u);
    }

    @Override
    public UserInformation updateUser(UserInformation u) {
        return userRepository.save(u);
    }

    @Override
    public UserInformation getUserById(long Id) {
        return  userRepository.findById(Id).get();
    }

    @Override
    public void deleteUserById(long Id) {
        this.userRepository.deleteById(Id);
    }

}
