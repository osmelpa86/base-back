package com.osmeldevs.base.name.application.configuration.exeption_handler;

import com.osmeldevs.base.name.application.controller.common.error.response.InternalErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
public class BaseServiceHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<InternalErrorResponse> handleException(Exception ex) {
        log.error(ex.getMessage(), ex);

        return new ResponseEntity<>(
                new InternalErrorResponse(ex.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
