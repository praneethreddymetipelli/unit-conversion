package com.fullstackchallenge.unitconversion.service;

import com.fullstackchallenge.unitconversion.model.ConversionRequest;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;

public interface ConversionService {

  ConversionResponse convert(ConversionRequest request);
}
