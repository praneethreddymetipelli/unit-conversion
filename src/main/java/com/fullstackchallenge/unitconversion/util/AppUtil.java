package com.fullstackchallenge.unitconversion.util;

import com.fullstackchallenge.unitconversion.enums.Temperature;
import com.fullstackchallenge.unitconversion.enums.Volume;

public class AppUtil {

  public static boolean isTemperaturePresent(String value) {
    for (Temperature temp : Temperature.values()) {
      if (temp.name().equalsIgnoreCase(value)) {
        return true;
      }
    }
    return false;
  }


  public static boolean isVolumePresent(String value) {
    for (Volume vol : Volume.values()) {
      if (vol.name().equalsIgnoreCase(value)) {
        return true;
      }
    }
    return false;
  }
}
