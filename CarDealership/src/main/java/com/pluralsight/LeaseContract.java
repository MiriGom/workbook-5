package com.pluralsight;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;
    private double monthlyLeaseFinance;

    public LeaseContract(String customerName, String customerEmail, String dateOfContract, Vehicle vehicleSold, double totalPrice, double monthlyPayment, double expectedEndingValue, double leaseFee, double monthlyLeaseFinance) {
        super(customerName, customerEmail, dateOfContract, vehicleSold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
        this.monthlyLeaseFinance = monthlyLeaseFinance;
    }
    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }
    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }
    public double getLeaseFee() {
        return leaseFee;
    }
    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }
    public double getMonthlyLeaseFinance() {
        return monthlyLeaseFinance;
    }
    public void setMonthlyLeaseFinance(double monthlyLeaseFinance) {
        this.monthlyLeaseFinance = monthlyLeaseFinance;
    }

    //provide overrides for getTotalPrice and getMonthlyPayments
}

