package com.example.ShapeFactories;

import com.example.Shape;
import com.example.Shapes.RoundedRectangle;
import com.example.Shapes.RoundedTriangle;

public class RoundedShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape getShape(String shapeType) {

        if(shapeType.isEmpty()) {
            return null;
        }

        switch(shapeType) {
            case "RoundedTriangle":
                return new RoundedTriangle();
            case "RoundedRectangle":
                return new RoundedRectangle();
            default:
                return null;
        }
    }
}
