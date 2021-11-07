package com.company;

// derived class
public class Rect extends GeometricFigure{
    double length;
    double width;

    // Constructor
    Rect(double length, double width, String name, int dimensions) {
        super(name, dimensions);
        this.length=length;
        this.width=width;
    }

    public void calculateArea(){
        double area = length*width;
        System.out.printf("The Area of Rectangle is: %.3f\n",area);
    }

    @Override
    public String toString(){
        return super.toString()+", Length: "+length+", Width: "+width+"\n";
    }
}
