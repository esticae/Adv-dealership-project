package com.pluralsight;

public class SalesContract extends Contract{
    private String DateOfContract;
    private String CustomerName;
    private String CustomerEmail;
    private int VehicleSold;
    private double Salestax;
    private double Recordingfee;
    private double processingfee;
    private double TotalPrice;
    private double MonthlyPayments;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, int vehicleSold) {
        super();
        DateOfContract = dateOfContract;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        VehicleSold = vehicleSold;
        Salestax = vehicleSold * 0.05;
        Recordingfee =v/;
    }

    public String getDateOfContract() {
        return DateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        DateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getVehicleSold() {
        return VehicleSold;
    }

    public void setVehicleSold(int vehicleSold) {
        VehicleSold = vehicleSold;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public double getSalestax() {
        return Salestax;
    }

    public void setSalestax(double salestax) {
        Salestax = salestax;
    }

    public double getRecordingfee() {
        return Recordingfee;
    }

    public void setRecordingfee(double recordingfee) {
        Recordingfee = recordingfee;
    }

    public double getProcessingfee() {
        return processingfee;
    }

    public void setProcessingfee(double processingfee) {
        this.processingfee = processingfee;
    }

    @Override
    public double getTotalPrice() {
        return (getVehicleSold().getPrice() - expectedEndingValue) + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        int numberOfPayments = 36;
        double interestRate = 4.0 / 1200;
        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }

}
