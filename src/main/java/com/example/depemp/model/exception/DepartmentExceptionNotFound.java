package com.example.depemp.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class DepartmentExceptionNotFound extends RuntimeException{
    public DepartmentExceptionNotFound(Long id){
        super(String.format("Department with id: %d was not found",id));
    }
}