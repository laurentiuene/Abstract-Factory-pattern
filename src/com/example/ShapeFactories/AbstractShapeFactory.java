package com.example.ShapeFactories;

import com.example.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(String shapeType);
}
