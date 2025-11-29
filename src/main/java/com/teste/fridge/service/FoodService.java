package com.teste.fridge.service;

import com.teste.fridge.model.Food;
import com.teste.fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    //listar
    public List<Food>getAll(){return foodRepository.findAll();}
    //criar
    public  Food save (Food food){return foodRepository.save(food);}
    //deletar
    public void delete(Long id){foodRepository.deleteById(id);}


}
