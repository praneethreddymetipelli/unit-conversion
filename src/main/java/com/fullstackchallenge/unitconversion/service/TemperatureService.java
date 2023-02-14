package com.fullstackchallenge.unitconversion.service;

import com.fullstackchallenge.unitconversion.enums.Temperature;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;

public interface TemperatureService {

  ConversionResponse convert(Temperature expression, Double request);
}
