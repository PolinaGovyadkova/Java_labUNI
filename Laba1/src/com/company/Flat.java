package com.company;

import java.util.ArrayList;

public class Flat {
    private int id;
    private int flatNumber;
    private double flatSquare;
    private int flatFloor;
    private int flatCount;
    private String street;
    private String typeOfBuilding;
    private int exploitation;

    public Flat( int id, int flatNumber, double flatSquare, int flatFloor, int flatCount, String street, String typeOfBuilding, int exploitation){
        this.id = id;
        this.flatNumber = flatNumber;
        this.flatFloor = flatFloor;
        this.flatCount = flatCount;
        this.flatSquare = flatSquare;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.exploitation = exploitation;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getFlatNumber() {
        return flatNumber;
    }
    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public double getFlatSquare() {
        return flatSquare;
    }
    public void setFlatSquare(double flatSquare) {
        this.flatSquare = flatSquare;
    }

    public int getFlatFloor() {
        return flatFloor;
    }
    public void setFlatFloor(int flatFloor) {
        this.flatFloor = flatFloor;
    }

    public int getFlatCount() {
        return flatCount;
    }
    public void setFlatCount(int flatCount) {
        this.flatCount = flatCount;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }
    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getExploitation() {
        return exploitation;
    }
    public void setExploitation(int exploitation) {
        this.exploitation = exploitation;
    }
    //TASK A
    public static Flat[] getByRoomsCount(int roomsCount ,Flat[] flats){
        ArrayList<Flat> result = new ArrayList<Flat>();
        int k = 0;
        for(int i = 0;i<flats.length;i++){
            if(roomsCount == flats[i].flatCount) {
                result.add(flats[i]);
                k++;
            }
        }
        return result.toArray(new Flat[k]);
    }
    //TASK B
    public static Flat[] getByRoomsCountAndFloor(int roomsCount, int lowerFloor, int upperFloor ,Flat[] flats){
        ArrayList<Flat> result = new ArrayList<Flat>();
        int k = 0;
        if(lowerFloor > upperFloor) {
            int temp = lowerFloor;
            lowerFloor = upperFloor;
            upperFloor = temp;
        }
        for(int i = 0;i<flats.length;i++){
            if(roomsCount == flats[i].flatCount && flats[i].flatFloor>=lowerFloor && flats[i].flatFloor<= upperFloor){
                result.add(flats[i]);
                k++;
            }
        }
        return result.toArray(new Flat[k]);
    }
    //TASK C
    public static Flat[] getBySquare(double square ,Flat[] flats){
        ArrayList<Flat> result = new ArrayList<Flat>();
        int k = 0;
        for(int i = 0;i<flats.length;i++){
            if(square < flats[i].flatSquare) {
                result.add(flats[i]);
                k++;
            }
        }
        return result.toArray(new Flat[k]);
    }

    public static Flat[] getAll(Flat[] flats){
        ArrayList<Flat> result = new ArrayList<Flat>();
        int k = 0;
        for(int i = 0;i<flats.length;i++){
            result.add(flats[i]);
            k++;
        }
        return result.toArray(new Flat[k]);
    }

    @Override
    public String toString() {
        return "Квартира{" + "id=" + id + ", номер квартиры=" + flatNumber + ", площадь=" + flatSquare + ", этаж=" + flatFloor + ", " +
                "кол-ва комнат=" + flatCount + ", тип здания=" + typeOfBuilding + ", срок эксплуатации=" + exploitation + "," +
                " улица='" + street + '\'' + '}';
    }
}
