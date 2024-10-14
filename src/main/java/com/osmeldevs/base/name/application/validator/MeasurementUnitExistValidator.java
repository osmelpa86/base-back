package com.osmeldevs.base.name.application.validator;

import com.osmeldevs.base.name.application.validator.annotations.MeasurementUnitExists;
import com.osmeldevs.base.name.domain.exception.ResourceNotFoundException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

@RequiredArgsConstructor
public class MeasurementUnitExistValidator implements ConstraintValidator<MeasurementUnitExists, UUID> {

    private final MeasurementUnitRepository measurementUnitRepository;

    @SneakyThrows
    @Override
    public boolean isValid(UUID measurementUnitId, ConstraintValidatorContext context) {
        this.measurementUnitRepository.find(measurementUnitId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "exception.resource.not.found",
                        new String[]{"MeasurementUnit", "measurementUnitId", measurementUnitId.toString()}
                ));
        return true;
    }

}
