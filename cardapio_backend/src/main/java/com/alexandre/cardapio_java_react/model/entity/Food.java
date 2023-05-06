package com.alexandre.cardapio_java_react.model.entity;

import com.alexandre.cardapio_java_react.model.dto.FoodRequestDTO;
import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "foods")
@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Float price;

    public Food() {
    }

    public Food(Long id, String title, String image, Float price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public Food(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
