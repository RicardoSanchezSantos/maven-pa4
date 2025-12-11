package com.sanchezsantos;

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan", "Pérez Gómez", 28, "juan@gmail.com");
        Gson gson = new Gson();
        String personaJson = gson.toJson(persona);
        System.out.println(personaJson);
    }
}