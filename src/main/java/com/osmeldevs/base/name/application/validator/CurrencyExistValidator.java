package com.osmeldevs.base.name.application.validator;

import com.osmeldevs.base.name.application.validator.annotations.CurrencyExists;
import com.osmeldevs.base.name.domain.exception.ResourceNotFoundException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

@RequiredArgsConstructor
public class CurrencyExistValidator implements ConstraintValidator<CurrencyExists, UUID> {

    private final BaseRepository baseRepository;

    @SneakyThrows
    @Override
    public boolean isValid(UUID currencyId, ConstraintValidatorContext context) {
        this.baseRepository.find(currencyId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "exception.resource.not.found",
                        new String[]{"Currency", "currencyId", currencyId.toString()}
                ));
        return true;
    }

}
