package com.osmeldevs.base.name.application.configuration.exeption_handler;

import com.osmeldevs.base.name.application.controller.common.error.response.ErrorContainerResponse;
import com.osmeldevs.base.name.application.controller.common.error.response.ErrorsResponseCreator;
import com.osmeldevs.base.name.domain.exception.ResourceUpdateException;
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
public class ResourceUpdateExceptionHandler {

    private final ErrorsResponseCreator errorsResponseCreator;

    @ExceptionHandler(ResourceUpdateException.class)
    public ResponseEntity<Object> handle(ResourceUpdateException ex) {

        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(
                new ErrorContainerResponse(this.errorsResponseCreator.create(ex.getMessage(), List.of(ex.getArgs()))),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

}
