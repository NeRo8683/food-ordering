package com.nero.fiore.service;

import com.nero.fiore.model.IngredientCategory;
import com.nero.fiore.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    public IngredientCategory createIngredientCategory(String name, Long restaurantId)throws Exception;
    public IngredientCategory findIngredientCategoryById(Long id)throws Exception;
    public List<IngredientCategory>findIngredientCategoryByRestaurantId(Long id)throws Exception;
    public IngredientsItem createIngredientsItem(Long restaurantId, String IngredientsName, Long categoryId)throws Exception;
    public List<IngredientsItem>findRestaurantIngredients(Long restaurantId);
    public IngredientsItem updateStock(Long id)throws Exception;
}
