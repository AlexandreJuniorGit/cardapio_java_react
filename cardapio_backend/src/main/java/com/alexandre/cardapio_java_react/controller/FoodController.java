package com.alexandre.cardapio_java_react.controller;

import com.alexandre.cardapio_java_react.model.entity.Food;
import com.alexandre.cardapio_java_react.model.dto.FoodRequestDTO;
import com.alexandre.cardapio_java_react.model.dto.FoodResponseDTO;
import com.alexandre.cardapio_java_react.model.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}
