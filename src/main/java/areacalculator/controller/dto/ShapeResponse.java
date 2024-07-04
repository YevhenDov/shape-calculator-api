package areacalculator.controller.dto;

import areacalculator.enums.ShapeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShapeResponse {

    private double area;
    private double perimeter;
    private ShapeType shapeType;

    public ShapeResponse(double area, double perimeter, ShapeType shapeType) {
        this.area = area;
        this.perimeter = perimeter;
        this.shapeType = shapeType;
    }
}
