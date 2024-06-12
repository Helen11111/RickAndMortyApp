package com.example.rickandmortyapp.controller;

import com.example.rickandmortyapp.model.CharactarData;
import com.example.rickandmortyapp.model.CharacterDataAll;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIController {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ArrayList<CharactarData> getAllCharacters() {
        CharacterController controller = retrofit.create(CharacterController.class);
        Call<CharacterDataAll> request = controller.getAllCharacters();

        try {
            Response<CharacterDataAll> response = request.execute();
            return response.body().results;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }

}
