package com.fullstackchallenge.unitconversion.enums;

public enum Temperature {
  CELSIUS_FAHRENHEIT {
    @Override
    public Double convert(Double value) {
      return (value) * 9 / 5 + 32;
    }
  },
  CELSIUS_RANKINE {
    @Override
    public Double convert(Double value) {
      return value * 9 / 5 + 491.67;
    }
  },
  CELSIUS_KELVIN {
    @Override
    public Double convert(Double value) {
      return value + 273.15;
    }
  },
  FAHRENHEIT_CELSIUS {
    @Override
    public Double convert(Double value) {
      return (value - 32) * 5 / 9;
    }
  },
  FAHRENHEIT_RANKINE {
    @Override
    public Double convert(Double value) {
      return value + 459.67;
    }
  },
  FAHRENHEIT_KELVIN {
    @Override
    public Double convert(Double value) {
      return (value - 32) * 5 / 9 + 273.15;
    }
  },
  RANKINE_FAHRENHEIT {
    @Override
    public Double convert(Double value) {
      return value - 459.67;
    }
  },
  RANKINE_CELSIUS {
    @Override
    public Double convert(Double value) {
      return (value - 491.67) * 5 / 9;
    }
  },
  RANKINE_KELVIN {
    @Override
    public Double convert(Double value) {
      return (value) * 5 / 9;
    }
  },
  KELVIN_FAHRENHEIT {
    @Override
    public Double convert(Double value) {
      return (value - 273.15) * 9 / 5 + 32;
    }
  },
  KELVIN_RANKINE {
    @Override
    public Double convert(Double value) {
      return value * 9 / 5;
    }
  },
  KELVIN_CELSIUS {
    @Override
    public Double convert(Double value) {
      return value - 273.15;
    }
  };

  public abstract Double convert(Double value);
}
