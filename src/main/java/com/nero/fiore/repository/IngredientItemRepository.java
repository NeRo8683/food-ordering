package com.nero.fiore.repository;

import com.nero.fiore.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientItemRepository extends JpaRepository<IngredientsItem, Long> {
    List<IngredientsItem>findByRestaurantId(Long id);
}
