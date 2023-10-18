package com.example.plan.food.entity;

import com.example.plan.customer.entity.Customer;
import com.example.plan.enums.Type;
import com.example.plan.meal.entity.Meal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gram")
    private double gram;

    @Column(name = "calories")
    private double calories;

    @Enumerated(EnumType.STRING)
    private Type type;

    /*@ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal = new Meal();*/
}
