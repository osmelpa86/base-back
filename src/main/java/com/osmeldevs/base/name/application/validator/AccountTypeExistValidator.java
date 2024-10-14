package com.osmeldevs.base.name.application.validator;

import com.osmeldevs.base.name.application.validator.annotations.AccountTypeExists;
import com.osmeldevs.base.name.domain.exception.ResourceNotFoundException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

@RequiredArgsConstructor
public class AccountTypeExistValidator implements ConstraintValidator<AccountTypeExists, UUID> {

    private final AccountTypeRepository accountTypeRepository;

    @SneakyThrows
    @Override
    public boolean isValid(UUID accountTypeId, ConstraintValidatorContext context) {
        this.accountTypeRepository.find(accountTypeId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "exception.resource.not.found",
                        new String[]{"AccountType", "accountTypeId", accountTypeId.toString()}
                ));
        return true;
    }

}
