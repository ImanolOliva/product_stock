package com.todocode.bazar.exceptions;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;



@RequiredArgsConstructor
public class NotFoundProduct extends ExceptionsCustom{


    private final String message;
    @Override
    public String getMessage() {
        return "error.product.entity.not-found.description";

    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public ExceptionTypes getTypeMessageCode() {
        return null;
    }

    @Override
    public String getTitleMessageCode() {
        return null;
    }
}
