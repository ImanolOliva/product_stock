package com.todocode.bazar.exceptions;

public class ExceptionsCustom extends Throwable{

    private String message;

    public ExceptionsCustom(String message){
        this.message = message;
    }
}
