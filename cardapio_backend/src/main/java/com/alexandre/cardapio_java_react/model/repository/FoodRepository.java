package com.alexandre.cardapio_java_react.model.repository;

import com.alexandre.cardapio_java_react.model.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
