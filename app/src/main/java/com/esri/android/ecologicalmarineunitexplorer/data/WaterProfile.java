package com.esri.android.ecologicalmarineunitexplorer.data;
/* Copyright 2016 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For additional information, contact:
 * Environmental Systems Research Institute, Inc.
 * Attn: Contracts Dept
 * 380 New York Street
 * Redlands, California, USA 92373
 *
 * email: contracts@esri.com
 *
 */

import com.esri.arcgisruntime.geometry.Point;

import java.util.*;

/**
 * An object representing a collection of Measurements for a
 * specific location in the ocean
 */
public class WaterProfile {

  private Point mLocation;
  private Set<Measurement> mMeasurementSet ;

  public WaterProfile(Point location){
    mLocation = location;
    mMeasurementSet = new TreeSet<>();
  }

  public void addMeasurement(Measurement m){
    mMeasurementSet.add(m);
  }

  /**
   * Return a list of Double values for a given
   * property.  The list is ordered by increasing
   * depth.
   * @param property
   * @return
   */
  public Map<Double,Double> getMeasurementsForProperty(String property){
    Map<Double,Double> measurementsByDepth = new TreeMap<>();
    int x = 0;
    for (Measurement measurement : mMeasurementSet){
      measurementsByDepth.put(measurement.getDepth(), measurement.getValueForProperty(property));
    }
    return measurementsByDepth;
  }
  /**
   * Return measurement count
   * @return int representing count of measurements
   */
  public int measurementCount(){
    return mMeasurementSet.size();
  }
}
