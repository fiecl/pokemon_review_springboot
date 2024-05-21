package com.pokemonreview.api.exceptions;

public class PokemonNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1; // NOTE: research on the purpose of this line of code

    public PokemonNotFoundException(String message) {
        super(message); // passing this message to the runtime exception
    }
}
