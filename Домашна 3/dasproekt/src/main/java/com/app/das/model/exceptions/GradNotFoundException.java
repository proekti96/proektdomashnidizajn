package com.app.das.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GradNotFoundException extends RuntimeException {
    public GradNotFoundException(Long id) {
        super(String.format("Gradot %d ne postoi vo bazata!", id));
    }
}
