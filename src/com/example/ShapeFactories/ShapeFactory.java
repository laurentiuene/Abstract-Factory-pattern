package com.example.ShapeFactories;

import com.example.Shape;
import com.example.Shapes.Rectangle;
import com.example.Shapes.Triangle;

public class ShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape getShape(String shapeType) {

        if(shapeType.isEmpty()) {
            return null;
        }

        switch(shapeType) {
            case "Triangle":
                return new Triangle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
