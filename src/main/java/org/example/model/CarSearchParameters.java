package org.example.model;

import java.util.Date;

public class CarSearchParameters {
  private String maker;
  private String model;
  private Integer yearFrom;
  private Integer yearTo;
  private Integer odometerFrom;
  private Integer odometerTo;
  private String vehicleCondition;
  private String states;
  private Date customDate;// eg. last 7 days
  private String saleCategory;
  private String badges;
  private String bodyType;
  private String bodyTypeConfig;
  private String fuelType;
  private String transmission;
  private String engine;
  private Integer cylinders;
  private String division;
  private String drive;
  private Integer seat;
  private Integer doors;
  private String description;
  private String sort;
  private String asc;

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getYearFrom() {
    return yearFrom;
  }

  public void setYearFrom(Integer yearFrom) {
    this.yearFrom = yearFrom;
  }

  public Integer getYearTo() {
    return yearTo;
  }

  public void setYearTo(Integer yearTo) {
    this.yearTo = yearTo;
  }

  public Integer getOdometerFrom() {
    return odometerFrom;
  }

  public void setOdometerFrom(Integer odometerFrom) {
    this.odometerFrom = odometerFrom;
  }

  public Integer getOdometerTo() {
    return odometerTo;
  }

  public void setOdometerTo(Integer odometerTo) {
    this.odometerTo = odometerTo;
  }

  public String getVehicleCondition() {
    return vehicleCondition;
  }

  public void setVehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
  }

  public String getStates() {
    return states;
  }

  public void setStates(String states) {
    this.states = states;
  }

  public Date getCustomDate() {
    return customDate;
  }

  public void setCustomDate(Date customDate) {
    this.customDate = customDate;
  }

  public String getSaleCategory() {
    return saleCategory;
  }

  public void setSaleCategory(String saleCategory) {
    this.saleCategory = saleCategory;
  }

  public String getBadges() {
    return badges;
  }

  public void setBadges(String badges) {
    this.badges = badges;
  }

  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public String getBodyTypeConfig() {
    return bodyTypeConfig;
  }

  public void setBodyTypeConfig(String bodyTypeConfig) {
    this.bodyTypeConfig = bodyTypeConfig;
  }

  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public Integer getCylinders() {
    return cylinders;
  }

  public void setCylinders(Integer cylinders) {
    this.cylinders = cylinders;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getDrive() {
    return drive;
  }

  public void setDrive(String drive) {
    this.drive = drive;
  }

  public Integer getSeat() {
    return seat;
  }

  public void setSeat(Integer seat) {
    this.seat = seat;
  }

  public Integer getDoors() {
    return doors;
  }

  public void setDoors(Integer doors) {
    this.doors = doors;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getAsc() {
    return asc;
  }

  public void setAsc(String asc) {
    this.asc = asc;
  }

  @Override
  public String toString() {
    return "CarSearchParameters{" +
        "maker='" + maker + '\'' +
        ", model='" + model + '\'' +
        ", yearFrom=" + yearFrom +
        ", yearTo=" + yearTo +
        ", odometerFrom=" + odometerFrom +
        ", odometerTo=" + odometerTo +
        ", vehicleCondition='" + vehicleCondition + '\'' +
        ", states='" + states + '\'' +
        ", customDate=" + customDate +
        ", saleCategory='" + saleCategory + '\'' +
        ", badges='" + badges + '\'' +
        ", bodyType='" + bodyType + '\'' +
        ", bodyTypeConfig='" + bodyTypeConfig + '\'' +
        ", fuelType='" + fuelType + '\'' +
        ", transmission='" + transmission + '\'' +
        ", engine='" + engine + '\'' +
        ", cylinders=" + cylinders +
        ", division='" + division + '\'' +
        ", drive='" + drive + '\'' +
        ", seat=" + seat +
        ", doors=" + doors +
        ", description='" + description + '\'' +
        ", sort='" + sort + '\'' +
        ", asc='" + asc + '\'' +
        '}';
  }
}

