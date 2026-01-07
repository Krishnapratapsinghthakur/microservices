package com.krishna.user.service;

import com.krishna.user.entity.User;
import com.krishna.user.repo.Userrepository;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    private final Userrepository userrepository;
    public Userservice(Userrepository userrepository)
    {
        this.userrepository=userrepository;
    }
    public User save(User user)
    {
        return userrepository.save(user);
    }
}
