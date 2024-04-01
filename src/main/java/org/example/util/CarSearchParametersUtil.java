package org.example.util;

import java.sql.Date;
import java.time.LocalDate;
import org.example.model.CarSearchParameters;
import org.springframework.util.StringUtils;

public class CarSearchParametersUtil {

  public static CarSearchParameters AssembleCarSearchParameters(String maker, String model, String year,
      String odometer, String vehicleCondition, String states, String customDate, String saleCategory, String badges,
      String bodyType, String bodyTypeConfig, String fuelType, String transmission, String engine, String cylinders,
      String division, String drive, String seat, String doors, String description, String sort, String asc) {

    CarSearchParameters parameters = new CarSearchParameters();
    parameters.setMaker(maker);
    parameters.setModel(model);

    parameters.setYearFrom(StringUtils.hasText(year) ? splitStringIntoRange(year).getStart() : null);
    parameters.setYearTo(StringUtils.hasText(year) ? splitStringIntoRange(year).getEnd() : null);
    parameters.setOdometerFrom(StringUtils.hasText(odometer) ? splitOdometerIntoRange(odometer).getStart() : null);
    parameters.setOdometerTo(StringUtils.hasText(odometer) ? splitOdometerIntoRange(odometer).getEnd() : null);

    parameters.setVehicleCondition(vehicleCondition);
    parameters.setStates(states);
    parameters.setCustomDate(StringUtils.hasText(customDate) ? getDateFromCustomDate(customDate) : null);
    parameters.setSaleCategory(saleCategory);
    parameters.setBadges(badges);
    parameters.setBodyType(bodyType);
    parameters.setBodyTypeConfig(bodyTypeConfig);
    parameters.setFuelType(fuelType);
    parameters.setTransmission(transmission);
    parameters.setEngine(engine);
    parameters.setCylinders(StringUtils.hasText(cylinders) ? Integer.parseInt(cylinders) : null);
    parameters.setDivision(division);
    parameters.setDrive(drive);
    parameters.setSeat(StringUtils.hasText(seat) ? Integer.parseInt(seat) : null);
    parameters.setDoors(StringUtils.hasText(doors) ? Integer.parseInt(doors) : null);
    parameters.setDescription(description);
    parameters.setSort(StringUtils.hasText(sort) ? getPropertyFromSortString(sort) : null);

    parameters.setAsc(asc);

    return parameters;
  }

  public static Range splitStringIntoRange(String input) {
    String[] parts = input.split("\\s*-\\s*");
    int start = Integer.parseInt(parts[0]);
    int end = Integer.parseInt(parts[1]);
    return new Range(start, end);
  }

  public static class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public int getStart() {
      return start;
    }

    public int getEnd() {
      return end;
    }
  }

  public static DistanceRange splitOdometerIntoRange(String input) {
    String[] parts = input.split("\\s*-\\s*");
    int start = parseDistance(parts[0]);
    int end = parseDistance(parts[1]);
    return new DistanceRange(start, end);
  }

  public static int parseDistance(String distanceStr) {
    // Remove "km" from the distance string and trim any whitespace
    distanceStr = distanceStr.replaceAll("[^\\d]", "").trim();
    return Integer.parseInt(distanceStr);
  }

  public static class DistanceRange {

    private int start;
    private int end;

    public DistanceRange(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public int getStart() {
      return start;
    }

    public int getEnd() {
      return end;
    }
  }


  public static Date getDateFromCustomDate(String input) {
    int days = extractDays(input);
    LocalDate currentDate = LocalDate.now();
    LocalDate targetDate = currentDate.minusDays(days);
    return Date.valueOf(targetDate);
  }

  public static int extractDays(String input) {
    String number = input.replaceAll("\\D+", "");
    return Integer.parseInt(number);
  }

  public static String getPropertyFromSortString(String sortString) {
    if (sortString.equals("Sort by Age")) {
      return "year";
    } else if (sortString.equals("Sort by Sale Date")) {
      return "saledate";
    } else if (sortString.equals("Sort by Odometer")) {
      return "odometer";
    } else {
      return "";
    }
  }

  public static void main(String[] args) {
    System.out.println(splitStringIntoRange("1990 - 2000").getStart());

    String input = "0 - 5000 km";
    DistanceRange range = splitOdometerIntoRange(input);
    System.out.println("Start Distance: " + range.getStart());
    System.out.println("End Distance: " + range.getEnd());

    String input1 = "Last 7 days";
    String input2 = "Last 15 days";

    Date date1 = getDateFromCustomDate(input1);
    Date date2 = getDateFromCustomDate(input2);

    System.out.println("Date from " + input1 + ": " + date1);

    String input_age = "Sort by Age";
    String input_date = "Sort by Sale Date";
    String input_odo = "Sort by Odometer";

    String property1 = getPropertyFromSortString(input_age);
    String property2 = getPropertyFromSortString(input_date);
    String property3 = getPropertyFromSortString(input_odo);

    System.out.println("Property from " + input_age + ": " + property1);
    System.out.println("Property from " + input_date + ": " + property2);
    System.out.println("Property from " + input_odo + ": " + property3);
  }

//    Maker: AUDI
//    Model: A5
//    Year: 1990 - 2000
//    Odometer: 0 - 5000 km
//    Vehicle Condition: Excellent
//    States: ACT
//    Custom Date: Last 7 days
//    Sale Category: Auction
//    Badges: 30 TFSI
//    Body Type: Hatchback
//    Body Type Config: (Blank)
//        Fuel Type: Diesel
//    Transmission: Automatic
//    Engine: 1.0
//    Cylinders: 3
//    Division: Motor Vehicles
//    Drive: Front Wheel Drive
//    Seat: 4
//    Doors: 3
//    Description: abc
//    Sort: Sort by Age
//    Ascending: ASC

}
