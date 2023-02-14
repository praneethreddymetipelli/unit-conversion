package com.fullstackchallenge.unitconversion.controller;

import com.fullstackchallenge.unitconversion.factory.ConversionFactory;
import com.fullstackchallenge.unitconversion.model.ConversionRequest;
import com.fullstackchallenge.unitconversion.model.ConversionResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/unit-conversion")
public class ConversionController {

  final ConversionFactory factory;

  public ConversionController(ConversionFactory factory) {
    this.factory = factory;
  }

  @PostMapping("/convert")
  public ConversionResponse convert(@RequestBody ConversionRequest request) {
    return factory.execute(request);
  }
}
