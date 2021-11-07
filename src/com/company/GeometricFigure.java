package com.company;

// parent class
public abstract class GeometricFigure {
    String name;
    int dimensions;

    // constructor
    GeometricFigure(String name, int dimensions){
        this.name=name;
        this.dimensions=dimensions;
    }

    public abstract void calculateArea();

    @Override
    public String toString(){
        return "Name: "+name+", Dimensions: "+dimensions;
    }

    public void print(){
        System.out.println(this.toString());

    }
}
