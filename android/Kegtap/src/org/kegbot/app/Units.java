/**
 *
 */
package org.kegbot.app;

import javax.measure.quantities.Volume;
import javax.measure.units.NonSI;
import javax.measure.units.SI;

import org.jscience.physics.measures.Measure;

/**
 *
 * @author mike wakerly (mike@wakerly.com)
 */
public class Units {

  private Units() {
  }

  public static double volumeMlToOunces(double volumeMl) {
    Measure<Volume> vol = Measure.valueOf(volumeMl, SI.MILLI(NonSI.LITER));
    double ounces = vol.doubleValue(NonSI.OUNCE_LIQUID_US);
    return ounces;
  }

  public static double volumeOuncesToMl(double volumeOunces) {
    Measure<Volume> vol = Measure.valueOf(volumeOunces, NonSI.OUNCE_LIQUID_US);
    double ml = vol.doubleValue(SI.MILLI(NonSI.LITER));
    return ml;
  }

  public static double volumeMlToPints(double volumeMl) {
    return volumeMlToOunces(volumeMl) / 16.0;
  }

  public static double temperatureCToF(double tempC) {
    return (9.0 / 5.0) * tempC + 32;
  }

}