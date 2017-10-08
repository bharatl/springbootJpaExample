package com.springjpa.example.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.NOT_FOUND,
        reason = "No such entity"
)
public class EntityNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 7620661718603763487L;

    public EntityNotFoundException(String msg) {
        super(msg);
    }
}