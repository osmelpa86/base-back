package com.osmeldevs.base.name.application.controller.common.error.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FormErrorResponse {
    @Schema(description = "El código del error.", example = "exception.resource.create")
    @JsonProperty("code")
    private final String code;

    @Schema(description = "El listado de argumentos del mensaje de error.", example = "[\"AccountType\"]")
    @JsonProperty("args")
    private final List<String> args;
}
