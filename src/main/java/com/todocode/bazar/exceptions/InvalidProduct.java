package com.todocode.bazar.exceptions;

public class InvalidProduct extends ExceptionsCustom{
    public InvalidProduct(String message) {
        super("data fields invalid or null");
    }
}
