package com.osmeldevs.base.name.application.validator;

import com.osmeldevs.base.name.application.validator.annotations.PaymentMethodExists;
import com.osmeldevs.base.name.domain.exception.ResourceNotFoundException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

@RequiredArgsConstructor
public class PaymentMethodExistValidator implements ConstraintValidator<PaymentMethodExists, UUID> {

    private final PaymentMethodRepository paymentMethodRepository;

    @SneakyThrows
    @Override
    public boolean isValid(UUID paymentMethodId, ConstraintValidatorContext context) {
        this.paymentMethodRepository.find(paymentMethodId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "exception.resource.not.found",
                        new String[]{"PaymentMethod", "paymentMethodId", paymentMethodId.toString()}
                ));
        return true;
    }

}
