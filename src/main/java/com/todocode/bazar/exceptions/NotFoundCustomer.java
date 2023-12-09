package com.todocode.bazar.exceptions;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class NotFoundCustomer extends ExceptionsCustom{

    private final String message;

    @Override
    public HttpStatus getStatus() {
        return null;
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
