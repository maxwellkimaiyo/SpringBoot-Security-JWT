package com.web.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Error: Group is already in use!")
public class GroupAlreadyExistsException extends RuntimeException {

}