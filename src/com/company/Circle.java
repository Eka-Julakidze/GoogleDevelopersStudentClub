package com.company;

import javax.crypto.Cipher;

public class Circle extends GeometricFigure{
    double radius;

    // constructor
    Circle(double radius, String name, int dimensions) {
        super(name, dimensions);
        this.radius=radius;
    }

    public void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.printf("The Area of Rectangle is: %.3f\n",area);
    }

    @Override
    public String toString(){
        return super.toString()+", Radius: "+radius+"\n";
    }

}
