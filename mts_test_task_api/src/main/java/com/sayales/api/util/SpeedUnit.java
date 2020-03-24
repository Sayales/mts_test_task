package com.sayales.api.util;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.SpeedUnitImpl;

@JsonDeserialize(as = SpeedUnitImpl.class)
public interface SpeedUnit extends Unit {
}
