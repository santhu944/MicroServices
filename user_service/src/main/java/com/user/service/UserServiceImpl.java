package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list= List.of(
            new User(1311L,"Santhosh","8971114401"),
            new User(1312L,"Vk","897111450"),
            new User(1313L,"anu","8971114401")
    );
    @Override
    public User getUser(Long id){
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
