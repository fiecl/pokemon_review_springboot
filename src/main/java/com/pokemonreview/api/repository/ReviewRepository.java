package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    // _Id: For nested. You can also use "findByPokemonId" instead of "findByPokemon_Id" and you'll still have the same result
    List<Review> findByPokemon_Id(int pokemonId);
}
