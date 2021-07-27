package com.example;

import com.example.ShapeFactories.AbstractShapeFactory;
import com.example.ShapeFactories.FactoryProducer;

public class Main {

    public static void main(String[] args) {

        //Producing a rounded shapes factory
        AbstractShapeFactory shapeFactory = FactoryProducer.produceFactory(true);

        System.out.println("Creating the first shape...");
        Shape shape1 = shapeFactory.getShape("RoundedTriangle");
        shape1.draw();

        System.out.println("Creating the second shape...");
        Shape shape2 = shapeFactory.getShape("RoundedRectangle");
        shape2.draw();

        //Producing a normal shapes factory
        shapeFactory = FactoryProducer.produceFactory(false);

        System.out.println("Creating the third shape...");
        Shape shape3 = shapeFactory.getShape("Triangle");
        shape3.draw();

        System.out.println("Creating the fourth shape...");
        Shape shape4 = shapeFactory.getShape("Rectangle");
        shape4.draw();
    }
}
