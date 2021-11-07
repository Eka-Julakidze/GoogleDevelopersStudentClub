package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    // public
//    // default
//    // protected
//    // private
//
//    private int add(int a, int b) {
////        int d=a+b;
////        System.out.println("Java "+d);
//        return a+b;
//    }

    public static void main(String[] args) {
        //        //type name = new type(arguments);
        GeometricFigure r = new Rect(10, 4.5, "Rectangle", 2);
        GeometricFigure c = new Circle(2.5, "Circle", 2);
        IThreeDimensional cube = new Cube(3, "Cube", 3);
        Apple a = new Apple("Apple", "Green");

        cube.calculateVolume();
        // cube.calculateArea() this is not visible???
        r.calculateArea();
        c.calculateArea();
        a.slice(0.5);
        a.slice(4);

//
//        r.print();
//        c.print();

        List<GeometricFigure> figures = new ArrayList<GeometricFigure>();
        figures.add(c);
        figures.add(r);

        System.out.println();
        for (var f:figures) {
            f.print();
        }



//        //type name = new type(arguments);
//        Apple a = new Apple("Apple", "Green");
//        System.out.println(a.getColor());
//        a.setColor("Red");
//        System.out.println(a.getColor());


//        // type name
//
//        // Declaration
//        int age;
//
//        // Initialization
//        age=10;
//
//        int count=12;
//        boolean isValid=false; // true
//        byte b = 0;
//
//        float percent = 0.45f;
//        double p = 0.55;
//
//        char letter = 'a';
//        String name="Java";
//
//        // Person, Car, Computer
//        String language="Java";
//        if(language.length() > 8) {
//            System.out.println("contains MORE than 8 characters");
//        }
//        else {
//            System.out.println("contains LESS than 8 characters");
//        }
//
//
//        int[] numbers = {0,1,2,4,5,6,7,8,9};
//        int[] randomNumbers = new int[4]; // declaration
//
//        randomNumbers[0]=0; // initialization
//        randomNumbers[1]=1;
//        randomNumbers[2]=15;
//
//        System.out.println(randomNumbers[3]);
//
//        for(int i=0; i<numbers.length; i++){
//            System.out.printf("Element at index i=%d: %d\n", i, numbers[i]);
//        }


    }
}
