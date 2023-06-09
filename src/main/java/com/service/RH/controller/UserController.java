package com.service.RH.controller;

import com.service.RH.Converter.UserInformationConverter;
import com.service.RH.DTO.UserInformationDto;
import com.service.RH.model.User;
import com.service.RH.model.UserInformation;
import com.service.RH.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserServiceImp userService;

    @Autowired
    private UserInformationConverter userInformationConverter;

    // http://localhost:8089/SpringMVC/retrieve-all-user
    @GetMapping("/retrieve-all-user")
    public List<User> list() {
        return userService.findAllUser();
    }

    //http://localhost:8089/SpringMVC/add-user
    @PostMapping("/add-user")
    public void add(@RequestBody User user) {
        userService.addUser(user);
    }


    // http://localhost:8089/SpringMVC/retrieve-user/3
    @GetMapping("/retrieve-user/{user-Id}")
    @ResponseBody
    public User retrieveUser(@PathVariable("user-Id") Long Id) {
        return userService.getUserById(Id);
    }

    // http://localhost:8089/SpringMVC/remove-user/{user-id}
    @DeleteMapping("/remove-user/{user-id}")
    @ResponseBody
    public void removeUser(@PathVariable("user-id") Long Id) {
        userService.deleteUserById(Id);
    }

    // http://localhost:8089/SpringMVC/modify-user
    @PutMapping("/modify-user")
    @ResponseBody
    public User modifyuser(@RequestBody User u) {
        return userService.updateUser(u);
    }

}
