package com.example.rickandmortyapp.model;

import java.util.ArrayList;

public class CharacterDataAll {
    public Info info;
    public ArrayList<CharactarData> results;

    public class Info{
        public int count;
        public int pages;
        public String next;
        public Object prev;
    }


}
