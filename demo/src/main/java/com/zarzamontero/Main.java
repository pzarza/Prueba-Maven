package com.zarzamontero;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        
        Persona p = new Persona("Pepe", 25);
        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
    }
}