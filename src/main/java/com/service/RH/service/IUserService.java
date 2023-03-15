package com.service.RH.service;

import com.service.RH.model.UserInformation;

import java.util.List;

public interface IUserService {
    List<UserInformation> findAllUser();

    UserInformation addUser(UserInformation u);

    UserInformation updateUser(UserInformation u);
    UserInformation getUserById(long Id);

    void deleteUserById(long Id);

}
