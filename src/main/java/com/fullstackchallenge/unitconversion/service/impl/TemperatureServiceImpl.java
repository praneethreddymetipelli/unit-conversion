package com.fullstackchallenge.unitconversion.service.impl;

import com.fullstackchallenge.unitconversion.enums.Temperature;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;
import com.fullstackchallenge.unitconversion.service.TemperatureService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

  @Override
  public ConversionResponse convert(Temperature expression, Double value) {
    Double result = expression.convert(value);
    ConversionResponse response = new ConversionResponse();
    response.setResponse(BigDecimal.valueOf(result).setScale(2, RoundingMode.DOWN));
    return response;
  }
}
