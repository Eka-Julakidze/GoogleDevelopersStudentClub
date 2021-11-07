package com.company;

public class Apple {
    // Data (attributes/fields)
    private String name;
    private String color;

    //Constructor
    Apple(String name, String color){
        this.name=name;
        this.color=color;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor){
        this.color=newColor;
    }

    public void setName(String newName){
        this.name=newName;
    }

    // Actions(methods/functions)
    public void slice(int num){
        System.out.printf("Slicing apple into %d pieces\n", num);
    }

    public void slice(double n) {
        System.out.printf("Slicing apple into %.2f pieces\n", n);
    }



}
