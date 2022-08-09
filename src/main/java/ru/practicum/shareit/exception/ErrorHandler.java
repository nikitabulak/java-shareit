package ru.practicum.shareit.exception;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler({UserNotFoundException.class, ItemNotFoundException.class, BookingNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFoundException(final RuntimeException e) {
        return new ErrorResponse(
                e.getMessage()
        );
    }

    @ExceptionHandler({ItemNotAvailableException.class, WrongStartOrEndTimeException.class, IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleNotAvailableException(final RuntimeException e) {
        return new ErrorResponse(
                e.getMessage()
        );
    }
}
