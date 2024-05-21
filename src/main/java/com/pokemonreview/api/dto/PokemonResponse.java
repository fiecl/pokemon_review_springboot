package com.pokemonreview.api.dto;

import lombok.Data;

import java.util.List;

// This is for the pagination
@Data
public class PokemonResponse {
    private List<PokemonDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
