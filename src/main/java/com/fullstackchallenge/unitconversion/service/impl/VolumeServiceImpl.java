package com.fullstackchallenge.unitconversion.service.impl;

import com.fullstackchallenge.unitconversion.enums.Volume;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;
import com.fullstackchallenge.unitconversion.service.VolumeService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;

@Service
public class VolumeServiceImpl implements VolumeService {

  @Override
  public ConversionResponse convert(Volume expression, Double value) {
    Double result = expression.convert(value);
    ConversionResponse response = new ConversionResponse();
    response.setResponse(BigDecimal.valueOf(result).setScale(2, RoundingMode.DOWN));
    return response;
  }
}
