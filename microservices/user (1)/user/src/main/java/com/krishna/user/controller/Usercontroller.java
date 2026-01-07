package com.krishna.user.controller;

import com.krishna.user.dto.UserDTO;
import com.krishna.user.entity.User;
import com.krishna.user.service.Userservice;
import jakarta.ws.rs.POST;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ritik")
public class Usercontroller {
    private final Userservice userservice;
    private final PasswordEncoder passwordEncoder;
    public Usercontroller(Userservice userservice,PasswordEncoder passwordEncoder)
    {
        this.passwordEncoder=passwordEncoder;
        this.userservice=userservice;
    }
    @GetMapping
    public ResponseEntity<String> get()
    {
        return ResponseEntity.ok("hii from ritik");
    }
    @PostMapping
    public ResponseEntity<UserDTO> register(@RequestBody User user)
    {
        String passwrod=user.getPassword();
        String encoded=passwordEncoder.encode(passwrod);
        user.setPassword(encoded);

        User dbuser=userservice.save(user);
        UserDTO resUser=new UserDTO();
        resUser.setEmail(dbuser.getEmail());
        resUser.setUsername(dbuser.getUsername());
        return ResponseEntity.ok(resUser);



    }
}
