package com.todocode.bazar.exceptions;

import org.springframework.http.HttpStatus;

public  abstract class ExceptionsCustom extends RuntimeException{

    public abstract String getMessage();


    public abstract HttpStatus getStatus();


    public abstract ExceptionTypes getTypeMessageCode();


    public abstract String getTitleMessageCode();



}
