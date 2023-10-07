
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsuranceData {
    private String breakdownCover;
    private String windscreenRepair;
    private int numberOfAccident;
    private String registrationNumber;
    private int totalMileage;
    private int estimatedValue;
    private String parkingLocation;
    private String dayStartPolicy;
    private int premiumValue;

    InsuranceData() {

    }

    InsuranceData(String[] values) {
        breakdownCover = values[0];
        windscreenRepair = values[1];
        numberOfAccident = Integer.parseInt(values[2]);
        registrationNumber = values[3];
        totalMileage = Integer.parseInt(values[4]);
        estimatedValue = Integer.parseInt(values[5]);
        parkingLocation = values[6];
        dayStartPolicy = values[7];
        premiumValue = Integer.parseInt(values[8]);
    }

    // Getters and setters for the class variables

    public String getBreakdownCover() {
        return breakdownCover;
    }

    public void setBreakdownCover(String breakdownCover) {
        this.breakdownCover = breakdownCover;
    }

    public String getWindscreenRepair() {
        return windscreenRepair;
    }

    public void setWindscreenRepair(String windscreenRepair) {
        this.windscreenRepair = windscreenRepair;
    }

    public int getNumberOfAccident() {
        return numberOfAccident;
    }

    public void setNumberOfAccident(int numberOfAccident) {
        this.numberOfAccident = numberOfAccident;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(int totalMileage) {
        this.totalMileage = totalMileage;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public String getDayStartPolicy() {
        return dayStartPolicy;
    }

    public void setDayStartPolicy(String dayStartPolicy) {
        this.dayStartPolicy = dayStartPolicy;
    }

    public int getPremiumValue() {
        return premiumValue;
    }

    public void setPremiumValue(int premiumValue) {
        this.premiumValue = premiumValue;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "breakdownCover='" + breakdownCover + '\'' +
                ", windscreenRepair='" + windscreenRepair + '\'' +
                ", numberOfAccident=" + numberOfAccident +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", totalMileage=" + totalMileage +
                ", estimatedValue=" + estimatedValue +
                ", parkingLocation='" + parkingLocation + '\'' +
                ", dayStartPolicy='" + dayStartPolicy + '\'' +
                ", premiumValue=" + premiumValue +
                '}';
    }

}
