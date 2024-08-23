package com.educandoweb.course.com.educandoweb.course.services.com.educandoweb.course.services.exception;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id" + id);
    }
}
