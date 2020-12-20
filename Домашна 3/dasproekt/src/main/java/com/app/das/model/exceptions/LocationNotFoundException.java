package com.app.das.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LocationNotFoundException extends RuntimeException {
    public LocationNotFoundException(Long id) {
        super(String.format("Lokacijata so shifra %d ne e najdena vo gradot", id));
    }
}
