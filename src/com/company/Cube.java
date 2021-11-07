package com.company;

public class Cube extends GeometricFigure implements IThreeDimensional{
    double side;

    // constructor
    Cube(double side, String name, int dimensions){
        super(name,dimensions);
        this.side=side;
    }

    public void calculateArea(){
        double surfaceArea=6*side*side;
        System.out.printf("The surface area of cube is: %.3f\n",surfaceArea);
    }

    public void calculateVolume() {
        double volume=side*side*side;
        System.out.printf("The volume area of cube is: %.3f\n",volume);

    }

    @Override
    public String toString(){
        return super.toString()+", Side: "+side+"\n";
    }

    public void print(){
        System.out.println(this.toString());
    }
}
