package com.isracart.common;

public class Conversion {

    public Conversion(){

    }

    public String getNumberOnly(String text){
        String str = text.split("=")[1].trim();
        return str.substring(0,6);
    }
}
