package com.teste.fridge.controller;


import com.teste.fridge.service.FoodService;
import com.teste.fridge.model.Food;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    //Injeçao de Dependencia, Chamou o Service para o controller
    private  final FoodService foodService;
    //Contructor
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll(){return foodService.getAll();}
    @PostMapping
    public Food create(@RequestBody Food food){return foodService.save(food);}

}
