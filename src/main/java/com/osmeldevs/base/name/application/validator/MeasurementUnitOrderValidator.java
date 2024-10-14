package com.osmeldevs.base.name.application.validator;

import com.osmeldevs.base.name.domain.contract.paginated.Sort;
import com.osmeldevs.base.name.domain.use_case.measurement_unit.list.MeasurementUnitSortFields;

import java.util.Objects;

public class MeasurementUnitOrderValidator implements Validator<String> {

    @Override
    public boolean isValid(String order) {
        if (Objects.isNull(order) || order.isBlank()) {
            return false;
        }
        if (!order.matches(Sort.ORDER_VALID_FORMAT)) {
            return false;
        }
        String[] orderSplitted = order.split("\\.");
        if (!MeasurementUnitSortFields.isSortFieldValid(orderSplitted[0])) {
            return false;
        }
        return Sort.Criteria.isSortCriteriaValid(orderSplitted[1]);
    }
}