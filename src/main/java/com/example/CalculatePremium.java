package com.example;

public class CalculatePremium {
    public int cal(
            String breakdownCover,
            String windscreenRepair,
            int numberOfAccident,
            String RegistrationNumber,
            int totalMileage,
            int estimatedValue,
            String parkingLocation,
            String dayStartPolicy) {
        int premiumResult = 0;

        if (windscreenRepair.equals("YES")) {
            premiumResult += 30;
        }

        if (totalMileage > 5000) {
            premiumResult += 50;
        }

        if (estimatedValue < 100) {
            return -1; // no process
        }

        if (parkingLocation.equals("Public place")) {
            premiumResult += 30;
        }

        if (numberOfAccident == 0) {
            premiumResult = (int) Math.round(premiumResult * 0.7);
        }

        return premiumResult;
    }
}
