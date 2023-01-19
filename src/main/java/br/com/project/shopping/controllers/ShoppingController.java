package br.com.project.shopping.controllers;

import br.com.project.shopping.dto.ShoppingDto;
import br.com.project.shopping.models.ShoppingModel;
import br.com.project.shopping.services.ShoppingServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/shopping")
public class ShoppingController {

    final ShoppingServices shoppingServices;

    public ShoppingController(ShoppingServices shoppingServices) {
        this.shoppingServices = shoppingServices;

    }
    @PostMapping
    public ResponseEntity<Object> saveShoppingLoja(@RequestBody @Valid ShoppingDto shoppingDto){
        var shoppingModel = new ShoppingModel();
        BeanUtils.copyProperties(shoppingDto, shoppingModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(shoppingServices.save(shoppingModel));
    }

    @GetMapping
    public ResponseEntity<List<ShoppingModel>> getAllShopping (){
        return ResponseEntity.status(HttpStatus.OK).body(shoppingServices.findAll());
    }

//    @GetMapping (path = {"/{id}"})
//    public ResponseEntity<Object> getShoppingLoja(){
//        return ResponseEntity.ok().body(shoppingServices.findAll());
//
//    }





}
