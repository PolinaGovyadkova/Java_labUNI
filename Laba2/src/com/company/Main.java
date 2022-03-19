package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void listSpaceObjectsToString(ArrayList<SpaceObject> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += "" + list.get(i) + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StarSystem solar = new StarSystem(73, "Солнечная система");
        SpaceObject star = new Star(1, "Солнце", "G4");
        solar.getSpaceObjects().add(star);
        SpaceObject planet1 = new Planet(5, "Юпитер", 4, false);
        solar.getSpaceObjects().add(planet1);
        SpaceObject planet2 = new Planet(9, "Земля", 6, true);
        SpaceObject moon1 = new Moon(97, "Луна", "Земля");
        solar.getSpaceObjects().add(planet2);
        solar.getSpaceObjects().add(moon1);
        SpaceObject planet3 = new Planet(9, "Венера", 6, false);
        solar.getSpaceObjects().add(planet3);
        SpaceObjectMethods spaceObjectRepository = new SpaceObjectMethods(solar.getSpaceObjects());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Please input char to choose function.");
        System.out.println("1 - get the number of planets");
        System.out.println("2 - get name of star");
        System.out.println("3 - add new planet to system");
        System.out.println("4 - print system");
        System.out.println("5 - exit");
        String choice = scanner.next();
        switch (choice){
            case "1": {
                ArrayList<Planet> planets = spaceObjectRepository.getAllPlanet();
                System.out.println("In the current star system " + planets.size() + " planets");
                break;
            }
            case "2":{
                String starName = spaceObjectRepository.getStar().getName();
                System.out.println("StarName = " + starName);
                break;
            }
            case "3":{
                System.out.println("Input planetId: ");
                int planetId = scanner.nextInt();
                System.out.println("Input planetName: ");
                String planetName = scanner.next();
                System.out.println("Input wight: ");
                int planetWight = scanner.nextInt();
                System.out.println("Input isInhabited: ");
                System.out.println("1 - yes/ 2- no ");
                boolean isInhabited = false;
                switch (scanner.next()){
                    case "1":  isInhabited = true; break;
                    case "2":  isInhabited = false; break;
                }
                spaceObjectRepository.addPlanetToSystem(new Planet(planetId,planetName, planetWight, isInhabited));
                System.out.println("Planet was successfully added!");
                System.out.println("In the current star system " + spaceObjectRepository.getSize() + " planets");
                System.out.println("StarSystem: id=" + solar.getId() + ", name=" + solar.getName());
                System.out.println("[ SpaceObjects:");
                listSpaceObjectsToString(solar.getSpaceObjects());
                System.out.println("]");
                break;
            }
            case "4":{
                System.out.println("StarSystem: id=" + solar.getId() + ", name=" + solar.getName());
                System.out.println("[ SpaceObjects:");
                listSpaceObjectsToString(solar.getSpaceObjects());
                System.out.println("]");
                break;
            }
            case "5":{
                System.exit(0);
            }
            default:{
                System.out.println("You input wrong choice!");
            }
        }
    }
}
