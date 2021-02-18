package com.partyhost.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class UserDoesNotExistException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public UserDoesNotExistException() {
        super("This user with the provided email id doesn't exists.");
    }
}
