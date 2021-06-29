package com.loja.webservice.resources;

import com.loja.webservice.entities.User;
import com.loja.webservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();//User u = new User(1L, "Suetam", "mateus@hotmail.com", "996585056", "123456");
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") //É uma requisição do tipo GET
    public ResponseEntity<User> findById( @PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }



}
