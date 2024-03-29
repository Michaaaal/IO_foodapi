package com.example.foodapi.Models.Meals.Ingredient;

import com.example.foodapi.Models.Meals.Ingredient.Brand.Brand;
import com.example.foodapi.Models.Meals.Meal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "ingredients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientEntity implements Meal {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Brand brand;
    @Column(nullable = false)
    private String name;
    private String barcode;
    private Double saturatedFat;
    private Double fiber;

    @Column(nullable = false)
    private double carbs;
    @Column(nullable = false)
    private double calories;
    @Column(nullable = false)
    private double fat;
    @Column(nullable = false)
    private double protein;

}
