package coffee.pastry.joshuablog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import coffee.pastry.joshuablog.dto.ResponseDto;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

     @ExceptionHandler(value = IllegalArgumentException.class)
     public ResponseDto<String> handleArgumentException(IllegalArgumentException e) {

          System.out.println("중복 아이디!");

          return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
     }

}