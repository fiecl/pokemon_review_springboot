package com.pokemonreview.api.controllers;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.models.Pokemon;
import com.pokemonreview.api.services.PokemonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {

    private PokemonService pokemonService;

    @Autowired // official way of doing things is to use @Autowired in the constructor, not in the service above
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("pokemon")
    public ResponseEntity<List<PokemonDto>> getPokemons() {
        return new ResponseEntity<>(pokemonService.getAllPokemon(), HttpStatus.OK);
    }

    @GetMapping("pokemon/{id}")
    public ResponseEntity<Pokemon> pokemonDetail(@PathVariable int id) {
        Pokemon pokemon = new Pokemon(id, "Squirtle", "Water");
        return ResponseEntity.ok(pokemon);
    }

    @PostMapping("pokemon/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto) {
        return new ResponseEntity<>(pokemonService.createPokemon(pokemonDto), HttpStatus.CREATED);
    }

    @PutMapping("pokemon/{id}/update")
    public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") int pokemonId) {
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());
        return ResponseEntity.ok(pokemon);
    }

    @DeleteMapping("pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId) {
        System.out.println(pokemonId);
        return ResponseEntity.ok("Pokemon deleted successfully");
    }
}
