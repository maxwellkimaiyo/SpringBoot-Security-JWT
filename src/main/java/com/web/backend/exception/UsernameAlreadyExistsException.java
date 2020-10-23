package com.web.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Error: Username is already taken!")
public class UsernameAlreadyExistsException extends RuntimeException {

}