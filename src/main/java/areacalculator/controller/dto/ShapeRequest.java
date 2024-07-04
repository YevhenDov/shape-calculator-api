package areacalculator.controller.dto;

import areacalculator.enums.ShapeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShapeRequest {

    ShapeType shapeType;
    private Double[] parameters;
}
