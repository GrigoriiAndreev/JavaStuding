package com.example.myfirstapp;

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber"))
            brands.add("Jack Amber");
        else if (color.equals("light"))
            brands.add("Light Moose");
        else if (color.equals("brown"))
            brands.add("Brown Pale Ale");
        else
            brands.add("Gout Stout");
        return brands;
    }
}
