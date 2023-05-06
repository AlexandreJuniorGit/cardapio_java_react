package com.alexandre.cardapio_java_react.model.dto;

import com.alexandre.cardapio_java_react.model.entity.Food;

public record FoodResponseDTO(Long id, String title, String image, Float price) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
