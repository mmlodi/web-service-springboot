package com.loja.webservice.resources;

import com.loja.webservice.entities.Product;
import com.loja.webservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();//Product u = new Product(1L, "Suetam", "mateus@hotmail.com", "996585056", "123456");
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") //É uma requisição do tipo GET
    public ResponseEntity<Product> findById( @PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }



}
