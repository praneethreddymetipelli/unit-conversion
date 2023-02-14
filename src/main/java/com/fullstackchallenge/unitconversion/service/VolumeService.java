package com.fullstackchallenge.unitconversion.service;

import com.fullstackchallenge.unitconversion.enums.Volume;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;

public interface VolumeService {

  ConversionResponse convert(Volume expression, Double value);
}
