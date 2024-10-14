package com.osmeldevs.base.name.application.controller.common.error.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternalErrorResponse {
    @JsonProperty("message")
    private final String message;
}