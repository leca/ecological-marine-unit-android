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

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.esri.arcgisruntime.geometry.Point;


public class EMUObservation implements Comparable<EMUObservation> {
  @NonNull private EMU emu;
  @NonNull private int top;
  @NonNull private int thickness;
  @NonNull private Point location;
  @Nullable private Double salinity;
  @Nullable private Double temperature;
  @Nullable private Double oxygen;
  @Nullable private Double phosphate;
  @Nullable private Double silicate;
  @Nullable private Double nitrate;

  @Nullable public Double getOxygen() {
    return oxygen;
  }

  public void setOxygen(@Nullable Double oxygen) {
    this.oxygen = oxygen;
  }



  @Override public int compareTo(EMUObservation another) {
    if (this.getTop() > another.getTop()){
      return -1;
    }
    if (this.getTop() < another.getTop()){
      return 1;
    }else{
      return 0;
    }

  }

  @Override public String toString() {
    return "EMUObservation{" +
        "emu=" + emu +
        ", top=" + top +
        ", thickness=" + thickness +
        ", location=" + location +
        ", salinity=" + salinity +
        ", temperature=" + temperature +
        ", oxygen=" + oxygen +
        ", phosphate=" + phosphate +
        ", silicate=" + silicate +
        ", nitrate=" + nitrate +
        '}';
  }

  @NonNull public EMU getEmu() {
    return emu;
  }

  public void setEmu(@NonNull EMU emu) {
    this.emu = emu;
  }

  @NonNull public int getTop() {
    return top;
  }

  public void setTop(@NonNull int top) {
    this.top = top;
  }

  @NonNull public int getThickness() {
    return thickness;
  }

  public void setThickness(@NonNull int thickness) {
    this.thickness = thickness;
  }

  @NonNull public Point getLocation() {
    return location;
  }

  public void setLocation(Point point) {
    this.location = point;
  }

  @Nullable public Double getSalinity() {
    return salinity;
  }

  public void setSalinity(@Nullable Double salinity) {
    this.salinity = salinity;
  }

  @Nullable public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(@Nullable Double temperature) {
    this.temperature = temperature;
  }

  @Nullable public Double getPhosphate() {
    return phosphate;
  }

  public void setPhosphate(@Nullable Double phosphate) {
    this.phosphate = phosphate;
  }

  @Nullable public Double getSilicate() {
    return silicate;
  }

  public void setSilicate(@Nullable Double silicate) {
    this.silicate = silicate;
  }

  @Nullable public Double getNitrate() {
    return nitrate;
  }

  public void setNitrate(@Nullable Double nitrate) {
    this.nitrate = nitrate;
  }
}
