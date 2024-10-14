package com.osmeldevs.base.name.application.validator.annotations;

import com.osmeldevs.base.name.application.validator.PaymentMethodExistValidator;
import com.osmeldevs.base.name.domain.exception.ResourceNotFoundException;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PaymentMethodExistValidator.class)
@Target({METHOD, PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface PaymentMethodExists {

    String message() default "Payment method does not exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends Throwable>[] exceptions() default {ResourceNotFoundException.class};
}
