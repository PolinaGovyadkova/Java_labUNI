package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Parking {
    HashMap<Integer, Car> cars;
    int count1= 0;
    //private Car[] cars;
    public Parking(int count){

        int temp = Math.abs(count);
        cars  = new HashMap<>(temp);
        count1 = temp;
        Full(temp);
    }

    public void Full(int count){
        for(int i = 0; i< count1; i++){
            cars.put(i,null);
        }
    }


    public String AddCar(Car newCar, int requiredPost){
        try {
            boolean flag = false;
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i) == newCar) {
                    flag = true;
                    break;
                }
            }
            if (requiredPost < cars.size() && flag == false) {
                for (int i = requiredPost; i < cars.size(); i++) {
                    if (cars.get(i) == null) {

                        cars.put(i, newCar);
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            return  e.getMessage();
        }

        return "Машина добавлена";
    }
    public String RemoveCar(Car oldCar) {
        try {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i) == oldCar) {
                    cars.put(i, null);
                }
            }

        } catch (Exception e) {
            return  e.getMessage();
        }
        return "Машина удалена";
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Parking: ");

        for(int i = 0; i< cars.size();i++){
            if(cars.get(i) != null) {
                result.append("\n Post " + i + ": " + cars.get(i).toString());
            }
        }
        return result.toString();
    }
}
