package com.pokemonreview.api.exceptions;

public class ReviewNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 2; // NOTE: research on the purpose of this line of code

    public ReviewNotFoundException(String message) {
        super(message);
    }
}
