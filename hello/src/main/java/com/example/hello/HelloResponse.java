package com.example.hello;


public class HelloResponse {
    private String message;

    public HelloResponse(String name) {
        this.message = "Hello " + name;
    }

    public HelloResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
