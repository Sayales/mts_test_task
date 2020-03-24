package com.sayales.api.dto.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sayales.api.dto.LengthDTO;
import com.sayales.api.util.LengthUnit;

@JsonRootName("length")
public class LengthDTOImpl extends UnitsValueImpl<LengthUnit, Double> implements LengthDTO {

    @JsonCreator
    public LengthDTOImpl(@JsonProperty("unit") LengthUnit unit,
                         @JsonProperty("value") Double value) {
        super(unit, value);
    }


}
