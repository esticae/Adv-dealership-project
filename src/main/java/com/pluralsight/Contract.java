package com.pluralsight;

public class Contract {
    private String DateOfContract;
    private String CustomerName;
    private String CustomerEmail;
    private int VehicleSold;
    private double TotalPrice;
    private double MonthlyPayments;

    public Contract(String customerName, String dateOfContract, String customerEmail, int vehicleSold) {
        CustomerName = customerName;
        DateOfContract = dateOfContract;
        CustomerEmail = customerEmail;
        VehicleSold = vehicleSold;
    }

    public String getDateOfContract() {
        return DateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        DateOfContract = dateOfContract;
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

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public double getMonthlyPayments() {
        return MonthlyPayments;
    }

    public void setMonthlyPayments(double monthlyPayments) {
        MonthlyPayments = monthlyPayments;
    }

    public String getDate() {
    }

    public Vehicle getVehicle() {
    }
}
