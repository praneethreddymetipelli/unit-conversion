package com.fullstackchallenge.unitconversion.enums;

public enum Volume {
  LITERS_TABLE_SPOONS {
    @Override
    public Double convert(Double value) {
      return value * 67.628;
    }
  },
  LITERS_CUBIC_INCHES {
    @Override
    public Double convert(Double value) {
      return value * 61.024;
    }
  },
  LITERS_CUPS {
    @Override
    public Double convert(Double value) {
      return value * 4.16667;
    }
  },
  LITERS_CUBIC_FEET {
    @Override
    public Double convert(Double value) {
      return value / 28.317;
    }
  },
  LITERS_GALLONS {
    @Override
    public Double convert(Double value) {
      return value / 3.785;
    }
  },
  TABLE_SPOONS_LITERS {
    @Override
    public Double convert(Double value) {
      return value / 67.628;
    }
  },
  TABLE_SPOONS_CUBIC_INCHES {
    @Override
    public Double convert(Double value) {
      return value / 1.108;
    }
  },
  TABLE_SPOONS_CUPS {
    @Override
    public Double convert(Double value) {
      return value / 16.231;
    }
  },
  TABLE_SPOONS_CUBIC_FEET {
    @Override
    public Double convert(Double value) {
      return value / 1915;
    }
  },
  TABLE_SPOONS_GALLONS {
    @Override
    public Double convert(Double value) {
      return value / 256;
    }
  },
  CUBIC_INCHES_LITERS {
    @Override
    public Double convert(Double value) {
      return value / 61.024;
    }
  },
  CUBIC_INCHES_TABLE_SPOONS {
    @Override
    public Double convert(Double value) {
      return value * 1.108;
    }
  },
  CUBIC_INCHES_CUPS {
    @Override
    public Double convert(Double value) {
      return value / 16.231;
    }
  },
  CUBIC_INCHES_CUBIC_FEET {
    @Override
    public Double convert(Double value) {
      return value / 14.646;
    }
  },
  CUBIC_INCHES_GALLONS {
    @Override
    public Double convert(Double value) {
      return value / 231;
    }
  },
  CUPS_LITERS {
    @Override
    public Double convert(Double value) {
      return value / 4.227;
    }
  },
  CUPS_CUBIC_INCHES {
    @Override
    public Double convert(Double value) {
      return value * 14.646;
    }
  },
  CUPS_TABLE_SPOONS {
    @Override
    public Double convert(Double value) {
      return value * 16.231;
    }
  },
  CUPS_CUBIC_FEET {
    @Override
    public Double convert(Double value) {
      return value / 118;
    }
  },
  CUPS_GALLONS {
    @Override
    public Double convert(Double value) {
      return value / 15.772;
    }
  },
  CUBIC_FEET_LITERS {
    @Override
    public Double convert(Double value) {
      return value * 28.317;
    }
  },
  CUBIC_FEET_CUBIC_INCHES {
    @Override
    public Double convert(Double value) {
      return value * 1728;
    }
  },
  CUBIC_FEET_CUPS {
    @Override
    public Double convert(Double value) {
      return value * 118;
    }
  },
  CUBIC_FEET_TABLE_SPOONS {
    @Override
    public Double convert(Double value) {
      return value * 1915;
    }
  },
  CUBIC_FEET_GALLONS {
    @Override
    public Double convert(Double value) {
      return value * 7.481;
    }
  },
  GALLONS_LITERS {
    @Override
    public Double convert(Double value) {
      return value * 3.785;
    }
  },
  GALLONS_CUBIC_INCHES {
    @Override
    public Double convert(Double value) {
      return value * 231;
    }
  },
  GALLONS_CUPS {
    @Override
    public Double convert(Double value) {
      return value * 15.773;
    }
  },
  GALLONS_TABLE_SPOONS {
    @Override
    public Double convert(Double value) {
      return value * 256;
    }
  },
  GALLONS_CUBIC_FEET {
    @Override
    public Double convert(Double value) {
      return value / 7.48;
    }
  };

  public abstract Double convert(Double value);
}
