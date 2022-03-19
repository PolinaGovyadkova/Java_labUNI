package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\nкол-во квартир ");
        int count = in.nextInt();
        int[] id = new int[count];
        int[] flatNumber = new int[count];
        double[] flatSquare = new double[count];
        int[] flatFloor = new int[count];
        int[] flatCount = new int[count];
        String[] street = new String[count];
        String[] typeOfBuilding = new String[count];
        int[] exploitation = new int[count];
        Flat[] flats = new Flat[count];
        int roomsCount;
        int newRoomsCount;
        int lowerFloor;
        int upperFloor;
        int newSquare;


        for(int i = 0; i < count; i++ )
        {
            int n = 0;
            int k = 0;
            id[i] = i+1;
            System.out.println("-------------------");
            System.out.println(id[i]);
            System.out.println("номер квартиры ");
            flatNumber[i] = in.nextInt();
            System.out.println("\nплощадь ");
            flatSquare[i] = in.nextInt();
            System.out.println("\nэтаж ");
            flatFloor[i] = in.nextInt();
            System.out.println("\nкол-во комнат ");
            flatCount[i] = in.nextInt();
            System.out.println("\nпериод эксплуатации(дней) ");
            exploitation[i] = in.nextInt();
            System.out.println("\nулица ");
            System.out.println("\n1.Ленина, \n2.Билецкого \n3.Советская \n4.Богатырёва \n5.Жарковского");
            k = in.nextInt();
            switch (k){
                case 1: street[i] = "Ленина"; break;
                case 2: street[i] = "Билецкого"; break;
                case 3: street[i] = "Советская"; break;
                case 4: street[i] = "Богатырёва"; break;
                case 5: street[i] = "Жарковского"; break;
                default: break;
            }
            System.out.println("\nтип здания ");
            System.out.println("\n1.Монолитно-кирпичный дом \n2.Панельный дом \n3.Монолитный дом \n4.Кирпичный дом");
            n = in.nextInt();
            switch (n){
                case 1: typeOfBuilding[i] = "Монолитно-кирпичный дом"; break;
                case 2: typeOfBuilding[i] = "Панельный дом"; break;
                case 3: typeOfBuilding[i] = "Монолитный дом"; break;
                case 4: typeOfBuilding[i] = "Кирпичный дом"; break;
                default: break;
            }

            flats[i] = new Flat(id[i], flatNumber[i], flatSquare[i],flatFloor[i] ,flatCount[i], street[i], typeOfBuilding[i], exploitation[i]);
        }

        for (Flat flat: Flat.getAll(flats))
        {
            System.out.println(flat);
        }

        System.out.println("\nсписок квартир с заданным числом комнат");
        System.out.println("Кол-во комнат ");
        roomsCount = in.nextInt();
        for (Flat flat: Flat.getByRoomsCount(roomsCount, flats))
        {
            System.out.println(flat);
        }
        System.out.println("\nсписок квартир с заданным числом комнат и расположенных на этаже, который находится в заданном промежутке");
        System.out.println("Кол-во комнат ");
        newRoomsCount = in.nextInt();
        System.out.println("Нижний этаж ");
        lowerFloor = in.nextInt();
        System.out.println("Верхний этаж ");
        upperFloor = in.nextInt();
        for (Flat flat: Flat.getByRoomsCountAndFloor(newRoomsCount, lowerFloor, upperFloor, flats))
        {
            System.out.println(flat);
        }
        System.out.println("\nсписок квартир с площадью большей заданной");
        System.out.println("Новая площадь");
        newSquare = in.nextInt();
        for (Flat flat: Flat.getBySquare(newSquare, flats))
        {
            System.out.println(flat);
        }
    }
}
