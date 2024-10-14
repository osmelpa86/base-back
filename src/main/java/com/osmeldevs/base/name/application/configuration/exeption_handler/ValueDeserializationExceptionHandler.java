package com.osmeldevs.base.name.application.configuration.exeption_handler;

import com.osmeldevs.base.name.application.controller.common.error.response.ErrorContainerResponse;
import com.osmeldevs.base.name.application.controller.common.error.response.ErrorsResponseCreator;
import com.osmeldevs.base.name.application.controller.common.error.response.FieldErrorResponse;
import com.osmeldevs.base.name.application.exception.ValueDeserializationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ValueDeserializationExceptionHandler {

    private final ErrorsResponseCreator errorsResponseCreator;

    @ExceptionHandler(ValueDeserializationException.class)
    public ResponseEntity<Object> handle(ValueDeserializationException ex) {

        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(
                new ErrorContainerResponse(this.errorsResponseCreator.create(
                        List.of(
                                new FieldErrorResponse(
                                        ex.getFieldName(),
                                        List.of(ex.getMessage())
                                ))
                )),
                HttpStatus.BAD_REQUEST
        );
    }

}
