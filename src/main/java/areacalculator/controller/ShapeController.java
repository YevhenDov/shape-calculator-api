package areacalculator.controller;

import areacalculator.controller.dto.ShapeRequest;
import areacalculator.controller.dto.ShapeResponse;
import areacalculator.entity.Shape;
import areacalculator.service.ShapeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/shape")
public class ShapeController {
    private final ShapeFactory shapeFactory;

    public ShapeController(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    @PostMapping("/calculate")
    public ResponseEntity<ShapeResponse> calculate(@RequestBody ShapeRequest shapeRequest) {
        validateParameters(shapeRequest.getParameters());

        Shape shape = shapeFactory.createShape(shapeRequest.getShapeType(), shapeRequest.getParameters());

        return ResponseEntity.ok(new ShapeResponse(shape.calculateArea(), shape.calculatePerimeter(), shape.getShapeType()));
    }

    private void validateParameters(Double[] parameters) {
        List<Double> validParameters =
                Arrays.stream(parameters)
                        .filter(Objects::nonNull)
                        .filter(p -> p > 0)
                        .toList();


        List<Double> shapeRequestParameters = new ArrayList<>(Arrays.asList(parameters));
        shapeRequestParameters.removeAll(validParameters);

        if (!shapeRequestParameters.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameters: " + shapeRequestParameters);
        }
    }
}
