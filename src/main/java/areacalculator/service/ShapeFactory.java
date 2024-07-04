package areacalculator.service;

import areacalculator.entity.Circle;
import areacalculator.entity.Rectangle;
import areacalculator.entity.Shape;
import areacalculator.entity.Square;
import areacalculator.entity.Triangle;
import areacalculator.enums.ShapeType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class ShapeFactory {
    private final Map<ShapeType, Function<Double[], Shape>> shapeMap = new HashMap<>();

    public ShapeFactory() {
//        shapeMap.put(ShapeType.CIRCLE, params -> new Circle(params[0]));
        shapeMap.put(ShapeType.CIRCLE, this::createCircle);
        shapeMap.put(ShapeType.SQUARE, params -> new Square(params[0]));
        shapeMap.put(ShapeType.RECTANGLE, params -> new Rectangle(params[0], params[1]));
        shapeMap.put(ShapeType.TRIANGLE, params -> new Triangle(params[0], params[1], params[2]));
    }

    private Circle createCircle(Double[] params) {
        return new Circle(params[0]);
    }

    public Shape createShape(ShapeType shapeType, Double... parameters) {
        Function<Double[], Shape> shapeCreator = shapeMap.get(shapeType);
        return shapeCreator.apply(parameters);
    }
}
