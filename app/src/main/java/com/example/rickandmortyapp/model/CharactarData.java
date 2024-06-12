package com.example.rickandmortyapp.model;

import java.util.ArrayList;

public class CharactarData {
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public Location location;
    public String image;
    public ArrayList<String> episode;
    public String url;
    public String created;

    public class Location{
        public String name;
        public String url;
    }

    public class Origin{
        public String name;
        public String url;
    }

}
