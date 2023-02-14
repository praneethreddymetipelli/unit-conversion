package com.fullstackchallenge.unitconversion.factory;

import com.fullstackchallenge.unitconversion.model.ConversionRequest;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;

public interface ConversionFactory {

  ConversionResponse execute(ConversionRequest request);
}
