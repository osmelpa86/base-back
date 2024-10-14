package com.osmeldevs.base.name.application.controller.common.valid.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ValidResponse {
	@JsonProperty("exist")
	private final boolean exist;
}
