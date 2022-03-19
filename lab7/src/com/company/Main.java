package com.company;

import catalog.Catalog;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Empty books history catalog");
        Catalog catalog = new Catalog();
        System.out.println(catalog.toString());
        System.out.println("Add some records");

        catalog.addRecord("Ivanov I.A.","1984", LocalDate.of(2021,2,1), LocalDate.of(2021,2,3));
        catalog.addRecord("Petrov S.B.","1984", LocalDate.of(2021,2,2), LocalDate.of(2021,2,7));
        catalog.addRecord("Kon A.B.","1984", LocalDate.of(2021,2,8), LocalDate.of(2021,2,15));
        System.out.println(catalog.toString());
    }
}
