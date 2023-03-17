package com.service.RH.service;

import com.service.RH.model.User;
import com.service.RH.model.UserInformation;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();

    User addUser(User u);

    User updateUser(User u);
    User getUserById(long id);

    Boolean deleteUserById(long id);

}
