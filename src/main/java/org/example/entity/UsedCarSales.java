package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "usedcarsales")
public class UsedCarSales {
  @Id
  @Column(name = "id", length = 36)
  private String id;

  @Column(name = "make", length = 20)
  private String make;

  @Column(name = "model", length = 20)
  private String model;

  @Column(name = "year")
  private Integer year;

  @Column(name = "description", length = 255)
  private String description;

  @Column(name = "odometer")
  private Integer odometer;

  @Column(name = "vehiclecondition", length = 20)
  private String vehiclecondition;

  @Column(name = "salelocation", length = 32)
  private String salelocation;

  @Column(name = "salecategory", length = 100)
  private String salecategory;

  @Column(name = "salvagevehicle", length = 3)
  private String salvagevehicle;

  @Column(name = "saledate")
  private Date saledate;

  @Column(name = "saleprice", precision = 10, scale = 2)
  private BigDecimal saleprice;

  @Column(name = "colour", length = 10)
  private String colour;

  @Column(name = "engine", length = 32)
  private String engine;

  @Column(name = "transmission", length = 100)
  private String transmission;

  @Column(name = "accessories", length = 32)
  private String accessories;

  @Column(name = "states", length = 10)
  private String states;

  @Column(name = "customdate")
  private Integer customdate;

  @Column(name = "badges", length = 20)
  private String badges;

  @Column(name = "bodytype", length = 10)
  private String bodytype;

  @Column(name = "bodytypeconfig", length = 20)
  private String bodytypeconfig;

  @Column(name = "fueltype", length = 6)
  private String fueltype;

  @Column(name = "cylinders")
  private Integer cylinders;

  @Column(name = "division", length = 20)
  private String division;

  @Column(name = "drive", length = 20)
  private String drive;

  @Column(name = "seat")
  private Integer seat;

  @Column(name = "doors")
  private Integer doors;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getOdometer() {
    return odometer;
  }

  public void setOdometer(Integer odometer) {
    this.odometer = odometer;
  }

  public String getVehiclecondition() {
    return vehiclecondition;
  }

  public void setVehiclecondition(String vehiclecondition) {
    this.vehiclecondition = vehiclecondition;
  }

  public String getSalelocation() {
    return salelocation;
  }

  public void setSalelocation(String salelocation) {
    this.salelocation = salelocation;
  }

  public String getSalecategory() {
    return salecategory;
  }

  public void setSalecategory(String salecategory) {
    this.salecategory = salecategory;
  }

  public String getSalvagevehicle() {
    return salvagevehicle;
  }

  public void setSalvagevehicle(String salvagevehicle) {
    this.salvagevehicle = salvagevehicle;
  }

  public Date getSaledate() {
    return saledate;
  }

  public void setSaledate(Date saledate) {
    this.saledate = saledate;
  }

  public BigDecimal getSaleprice() {
    return saleprice;
  }

  public void setSaleprice(BigDecimal saleprice) {
    this.saleprice = saleprice;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public String getAccessories() {
    return accessories;
  }

  public void setAccessories(String accessories) {
    this.accessories = accessories;
  }

  public String getStates() {
    return states;
  }

  public void setStates(String states) {
    this.states = states;
  }

  public Integer getCustomdate() {
    return customdate;
  }

  public void setCustomdate(Integer customdate) {
    this.customdate = customdate;
  }

  public String getBadges() {
    return badges;
  }

  public void setBadges(String badges) {
    this.badges = badges;
  }

  public String getBodytype() {
    return bodytype;
  }

  public void setBodytype(String bodytype) {
    this.bodytype = bodytype;
  }

  public String getBodytypeconfig() {
    return bodytypeconfig;
  }

  public void setBodytypeconfig(String bodytypeconfig) {
    this.bodytypeconfig = bodytypeconfig;
  }

  public String getFueltype() {
    return fueltype;
  }

  public void setFueltype(String fueltype) {
    this.fueltype = fueltype;
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

  // Getters and setters for all fields
  // Generated by IDE or written manually
}
