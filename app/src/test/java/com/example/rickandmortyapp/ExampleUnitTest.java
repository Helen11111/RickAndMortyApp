package com.example.rickandmortyapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    String jsonUnit2 = "{\"firstName\":\"Александр\",\"lastName\":\"Викторов\",\"school\":17}";

    @Test
    public void addition_isCorrect() {
        Unit unit = new Unit();
        unit.firstName = "Александр";
        unit.lastName = "Викторов";
        unit.school = 17;

        Gson gson = new Gson();
        Unit jsonUnit = gson.fromJson(jsonUnit2, Unit.class);
        //jsonUnit = jsonUnit.replace(",", ",\n");
        System.out.println("GSON Unit: \nfirstname: " + jsonUnit.firstName + "\nlastname: " + jsonUnit.lastName + "\nschool: " + jsonUnit.school);


    }

    class Unit{
        String firstName;
        String lastName;
        int school;
    }
}