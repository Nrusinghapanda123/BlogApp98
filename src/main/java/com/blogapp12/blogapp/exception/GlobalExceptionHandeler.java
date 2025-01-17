package com.blogapp12.blogapp.exception;

import com.blogapp12.blogapp.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandeler extends ResponseEntityExceptionHandler {

@ExceptionHandler()
    public ResponseEntity<ErrorDetails> resourceNotFound(ResourceNotFound e, WebRequest webRequest )
    {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),e.getMessage(),webRequest.getDescription(true));
        return  new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
