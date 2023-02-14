package com.fullstackchallenge.unitconversion.factory.impl;

import com.fullstackchallenge.unitconversion.enums.Temperature;
import com.fullstackchallenge.unitconversion.enums.Volume;
import com.fullstackchallenge.unitconversion.factory.ConversionFactory;
import com.fullstackchallenge.unitconversion.model.ConversionRequest;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;
import com.fullstackchallenge.unitconversion.service.TemperatureService;
import com.fullstackchallenge.unitconversion.service.VolumeService;
import com.fullstackchallenge.unitconversion.util.AppUtil;
import org.springframework.stereotype.Component;

@Component
public class ConversionFactoryImpl implements ConversionFactory {

  final TemperatureService temperatureService;

  final VolumeService volumeService;

  public ConversionFactoryImpl(
      TemperatureService temperatureService,
      VolumeService volumeService) {
    this.temperatureService = temperatureService;
    this.volumeService = volumeService;
  }

  @Override
  public ConversionResponse execute(ConversionRequest request) {
    if (AppUtil.isTemperaturePresent(request.getExpression())) {
      return temperatureService.convert(Temperature.valueOf(request.getExpression()),
          request.getValue());
    } else if (AppUtil.isVolumePresent(request.getExpression())) {
      return volumeService.convert(Volume.valueOf(request.getExpression()),
          request.getValue());
    }
    ConversionResponse failedResponse = new ConversionResponse();
    failedResponse.setError("Invalid");
    return failedResponse;
  }

}
