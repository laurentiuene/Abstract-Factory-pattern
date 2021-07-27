package com.example.ShapeFactories;

import com.example.ShapeFactories.AbstractShapeFactory;
import com.example.ShapeFactories.RoundedShapeFactory;
import com.example.ShapeFactories.ShapeFactory;

public class FactoryProducer {

    public static AbstractShapeFactory produceFactory(Boolean isRounded) {
        return isRounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
