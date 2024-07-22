package com.edsonfsousa.srvspringbootboilerplate.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Objects;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final String message;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    // Getter para message
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResourceNotFoundException{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceNotFoundException that = (ResourceNotFoundException) o;

        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }
}