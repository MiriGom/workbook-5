package com.pluralsight;

class Animal {
    private String name;
    private String color;
    public void eat(){
        System.out.println("chomp");
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}