package com.loja.webservice.resources;

import com.loja.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Suetam", "mateus@hotmail.com", "996585056", "123456" );
        return ResponseEntity.ok().body(u);
    }
}
