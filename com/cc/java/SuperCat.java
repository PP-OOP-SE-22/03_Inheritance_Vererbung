package com.cc.java;

public class SuperCat {

    private String name;
    private String furColor;
    protected int age;


    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!ERROR";
        }
    }


 

}
