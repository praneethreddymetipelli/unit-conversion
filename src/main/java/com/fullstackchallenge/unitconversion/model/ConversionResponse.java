package com.fullstackchallenge.unitconversion.model;

import java.math.BigDecimal;

public class ConversionResponse {

  private String error;
  private BigDecimal response;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public BigDecimal getResponse() {
    return response;
  }

  public void setResponse(BigDecimal response) {
    this.response = response;
  }
}
