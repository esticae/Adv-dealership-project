package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ContractFileManager {
    private static final String CONTRACTS_FILE_PATH = "contracts.csv";

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTRACTS_FILE_PATH, true))) {
            if (contract instanceof SalesContract salesContract) {
                writer.write("SALE|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicle().getVin() + "|");
            } else if (contract instanceof LeaseContract leaseContract) {
                writer.write("LEASE|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicle().getVin() + "|");

            }
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
