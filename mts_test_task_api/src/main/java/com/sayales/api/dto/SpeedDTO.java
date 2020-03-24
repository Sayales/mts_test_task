package com.sayales.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.SpeedDTOImpl;
import com.sayales.api.util.SpeedUnit;
import com.sayales.api.util.UnitsValue;

@JsonDeserialize(as = SpeedDTOImpl.class)
public interface SpeedDTO extends UnitsValue<SpeedUnit, Double> {
}
