package areacalculator.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleUserIllegalArgumentException(IllegalArgumentException ex) {
        log.error(ex.getMessage());

        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
