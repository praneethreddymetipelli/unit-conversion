package com.fullstackchallenge.unitconversion.model;

public class ConversionRequest {

  private String expression;
  private Double value;

  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
