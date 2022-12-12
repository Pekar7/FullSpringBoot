package com.example.fullspringboot.exception;

public class CustomerNotFoundException extends NullPointerException {
    public CustomerNotFoundException() {
        super();
    }
    public CustomerNotFoundException(String message) {
        super(message);
    }
    public CustomerNotFoundException(Throwable cause) {
        super(String.valueOf(cause));
    }
}
