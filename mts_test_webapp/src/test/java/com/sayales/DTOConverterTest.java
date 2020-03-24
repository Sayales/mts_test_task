package com.sayales;


import com.sayales.api.dto.CarDTO;
import com.sayales.api.dto.impl.CarDTOImpl;
import com.sayales.api.dto.impl.SpeedDTOImpl;
import com.sayales.api.dto.impl.SpeedUnitImpl;
import com.sayales.converter.DTOConverter;
import com.sayales.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DTOConverterTest {

    private DTOConverter converter = new DTOConverter();


    @Test
    public void testConvertCar() {
        CarDTO carDTO = new CarDTOImpl(1, "1", "1", "2", new SpeedDTOImpl(new SpeedUnitImpl("mh"), 20d));
        Car car = new Car(carDTO);

        CarDTO converted = converter.convertCar(car);
        Assertions.assertEquals(carDTO, converted);
    }


}
