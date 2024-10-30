package com.pluralsight;

public class SalesContract extends Contract{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean financing;
    private double monthlyPaymentFinanced;

    SalesContract(double salesTax, double recordingFee, double processingFee, boolean financing, double monthlyPaymentFinanced, String customerName, String customerEmail, String dateOfContract, Vehicle vehicleSold, double totalPrice, double monthlyPayment) {
        super(customerName, customerEmail, dateOfContract, vehicleSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financing = financing;
        this.monthlyPaymentFinanced = monthlyPaymentFinanced;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinancing() {
        return financing;
    }

    public void setFinancing(boolean financing) {
        this.financing = financing;
    }

    public double getMonthlyPaymentFinanced() {
        return monthlyPaymentFinanced;
    }

    public void setMonthlyPaymentFinanced(double monthlyPaymentFinanced) {
        this.monthlyPaymentFinanced = monthlyPaymentFinanced;
    }
    //provide overrides for getTotalPrice and getMonthlyPayments
}
