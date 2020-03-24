package com.sayales.api.dto.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sayales.api.dto.SpeedDTO;
import com.sayales.api.util.SpeedUnit;


@JsonRootName("max-speed")
public class SpeedDTOImpl extends UnitsValueImpl<SpeedUnit, Double> implements SpeedDTO {

    @JsonCreator
    public SpeedDTOImpl(@JsonProperty("unit") SpeedUnit unit,
                        @JsonProperty("value") Double value) {
        super(unit, value);
    }

}
