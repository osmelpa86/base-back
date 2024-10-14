package com.osmeldevs.base.name.application.configuration.exeption_handler;

import com.osmeldevs.base.name.application.controller.common.error.response.ErrorContainerResponse;
import com.osmeldevs.base.name.application.controller.common.error.response.ErrorsResponseCreator;
import com.osmeldevs.base.name.domain.exception.RequestValidationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestValidationExceptionHandler {

    private final ErrorsResponseCreator errorsResponseCreator;

    @ExceptionHandler(value = RequestValidationException.class)
    public ResponseEntity<ErrorContainerResponse> handle(RequestValidationException ex) {
        log.error(ex.getMessage(), ex);

        return new ResponseEntity<>(
                new ErrorContainerResponse(this.errorsResponseCreator.create(ex.getFieldErrors())),
                HttpStatus.BAD_REQUEST
        );
    }

}
