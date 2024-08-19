package com.mulingecode.customer;

public record CustomerRegistrationRequest(
    String name,
    String email,
    Integer age
){

}

