package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDataManager {
    static String contractFilePath = "contracts.csv";
    List<Contract> contractList = new ArrayList<>();
    //public Contract getContract() throws IOException {
        /*
        BufferedReader bufReader = new BufferedReader(new FileReader(contractFilePath));

        String csvLine;
        while ((csvLine = bufReader.readLine()) != null) {
            String[] dataArray = csvLine.split("\\|");
            //if its larger than 16 it is a sales contract
            if (dataArray.length >17) {
                String contractType = dataArray[0];
                String dateOfContract = dataArray[1];
                String customerName = dataArray[2];
                String customerEmail = dataArray[3];
                int vin;
                    try {
                        vin = Integer.parseInt(dataArray[4]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid format " + dataArray[4]);
                        continue;
                    }
                int year;
                    try {
                        year = Integer.parseInt(dataArray[5]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid format " + dataArray[5]);
                        continue;
                    }
                String make = dataArray[6];
                String model = dataArray[7];
                String vehicleType = dataArray[8];
                String color = dataArray[9];
                int odometer;
                    try {
                    odometer = Integer.parseInt(dataArray[10]);
                    }catch (NumberFormatException e) {
                        System.out.println("invalid format" + dataArray[10]);
                        continue;
                    }
                double price;
                    try {
                        price = Double.parseDouble(dataArray[11]);
                    }catch (NumberFormatException e) {
                        System.out.println("invalid format" + dataArray[11]);
                        continue;
                    }
                double salesTax;
                    try {
                        salesTax = Double.parseDouble(dataArray[12]);
                    }catch (NumberFormatException e) {
                        System.out.println("invalid format " + dataArray[13]);
                        continue;
                    }
                double recordingFee;
                    try {
                        recordingFee = Double.parseDouble(dataArray[14]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid format " + dataArray[14]);
                        continue;
                    }
                double processingFee;
                    try {
                        processingFee = Double.parseDouble(dataArray[15]);
                    } catch (NumberFormatException e){
                        System.out.println("invalid format " + dataArray[15]);
                        continue;
                    }
                double monthlyPaymentTotal;
                    try {
                        monthlyPaymentTotal = Double.parseDouble(dataArray[16]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid format " + dataArray[17]);
                        continue;
                    }
                boolean financing;
                    try {
                        financing = Boolean.parseBoolean(dataArray[18]);
                        if (dataArray[18].equalsIgnoreCase("YES")) {
                            financing = true;
                        } if (dataArray[18].equalsIgnoreCase("NO")) {
                            financing = false;
                        }
                    }catch (BootstrapMethodError e) {
                        System.out.println("invalid boolean" + dataArray[18]);
                        continue;
                    }
                    //it auto added the Overrides?
                // how would I include the Vehicle data in here?
                    SalesContract SalesContract = new SalesContract(contractType, dateOfContract, customerName, customerEmail, vin, year, make, model, vehicleType) {
                        @Override
                        public double getTotalPrice() {
                            return 0;
                        }

                        @Override
                        public double getMonthlyPayment() {
                            return 0;
                        }
                    }
            } if (dataArray.length < 18) {
                String contractType = dataArray[0];
                String dateOfContract = dataArray[1];
                String customerName = dataArray[2];
                String customerEmail = dataArray[3];
                int vin;
                try {
                    vin = Integer.parseInt(dataArray[4]);
                } catch (NumberFormatException e) {
                    System.out.println("invalid format " + dataArray[4]);
                    continue;
                }
                int year;
                try {
                    year = Integer.parseInt(dataArray[5]);
                } catch (NumberFormatException e) {
                    System.out.println("invalid format " + dataArray[5]);
                    continue;
                }
                String make = dataArray[6];
                String model = dataArray[7];
                String vehicleType = dataArray[8];
                String color = dataArray[9];
                int odometer;
                try {
                    odometer = Integer.parseInt(dataArray[10]);
                }catch (NumberFormatException e) {
                    System.out.println("invalid format" + dataArray[10]);
                    continue;
                }
                double price;
                try {
                    price = Double.parseDouble(dataArray[11]);
                }catch (NumberFormatException e) {
                    System.out.println("invalid format" + dataArray[11]);
                    continue;
                }
                double salesTax;
                try {
                    salesTax = Double.parseDouble(dataArray[12]);
                }catch (NumberFormatException e) {
                    System.out.println("invalid format " + dataArray[13]);
                    continue;
                }
                double recordingFee;
                try {
                    recordingFee = Double.parseDouble(dataArray[14]);
                } catch (NumberFormatException e) {
                    System.out.println("invalid format " + dataArray[14]);
                    continue;
                }
                double processingFee;
                try {
                    processingFee = Double.parseDouble(dataArray[15]);
                } catch (NumberFormatException e){
                    System.out.println("invalid format " + dataArray[15]);
                    continue;
                }
                double monthlyPaymentTotal;
                try {
                    monthlyPaymentTotal = Double.parseDouble(dataArray[16]);
                } catch (NumberFormatException e) {
                    System.out.println("invalid format " + dataArray[17]);
                    continue;
                }
                boolean financing;
                try {
                    financing = Boolean.parseBoolean(dataArray[18]);
                    if (dataArray[18].equalsIgnoreCase("YES")) {
                        financing = true;
                    } if (dataArray[18].equalsIgnoreCase("NO")) {
                        financing = false;
                    }
                }catch (BootstrapMethodError e) {
                    System.out.println("invalid boolean" + dataArray[18]);
                    continue;
                }
                //create a Lease contract and add it to the contracts List
                //but how do i add the vehicle information?
            }

        }
        return getContract();

         */
  //  }
    //Need to fix ASAP
    public void saveContract(Contract contract) {
        try {
            FileWriter writer = new FileWriter(contractFilePath, true);
            BufferedWriter bufWriter = new BufferedWriter(writer);

            contractList.add(contract);

            bufWriter.write(contract.toString());

            bufWriter.close();
        } catch (IOException e) {
            System.out.println("Problem writing to file");
        }

    }

}
