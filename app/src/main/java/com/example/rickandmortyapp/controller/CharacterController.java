package com.example.rickandmortyapp.controller;

import com.example.rickandmortyapp.model.CharacterDataAll;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CharacterController {
    @GET("character")
    Call<CharacterDataAll> getAllCharacters();
}
