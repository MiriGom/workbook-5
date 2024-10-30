package com.pluralsight;

public class Contract {
    protected String customerName;
    protected String customerEmail;
    protected String dateOfContract;
    protected Vehicle vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String customerName, String customerEmail, String dateOfContract, Vehicle vehicleSold, double totalPrice, double monthlyPayment) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.dateOfContract = dateOfContract;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }
    //getters and setters
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getDateOfContract() {
        return dateOfContract;
    }
    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }
    public Vehicle getVehicleSold() {
        return vehicleSold;
    }
    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
    public void getTotalPrice(){
        //write the method
    }
    public void getMonthlyPayment() {
        //write the method
    }
}
