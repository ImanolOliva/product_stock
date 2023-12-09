package com.todocode.bazar.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ExceptionTypes {

     INTERNAL_SEARCH("error.type.internal.search"),
     INTERNAL_INSET("error.type.internal.insert"),
     INTERNAL_UPDATE("error.type.internal.unpdate");


     private final String messageCode;



}
