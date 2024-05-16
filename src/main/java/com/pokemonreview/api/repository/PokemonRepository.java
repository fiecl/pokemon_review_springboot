package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

// <RepoName, Id of Repo>
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}
