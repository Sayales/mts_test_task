package com.sayales.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.LengthDTOImpl;
import com.sayales.api.util.LengthUnit;
import com.sayales.api.util.UnitsValue;

@JsonDeserialize(as = LengthDTOImpl.class)
public interface LengthDTO extends UnitsValue<LengthUnit, Double> {
}
