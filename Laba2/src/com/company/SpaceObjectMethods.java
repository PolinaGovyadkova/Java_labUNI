package com.company;
import java.util.ArrayList;
public class SpaceObjectMethods {
    private ArrayList<SpaceObject> spaceObjects;

    public SpaceObjectMethods(ArrayList<SpaceObject> spaceObjects) {
        this.spaceObjects = spaceObjects;
    }

    public ArrayList<Planet> getAllPlanet(){
        ArrayList<Planet> planets = new ArrayList<>();
        for (int i = 0; i < spaceObjects.size(); i++) {
            if (spaceObjects.get(i).getClass().equals(Planet.class)){
                planets.add((Planet) spaceObjects.get(i));
            }
        }
        return planets;
    }

    public void addPlanetToSystem(SpaceObject spaceObject){
        spaceObjects.add(spaceObject);
    }

    public Star getStar(){
        for (int i = 0; i < spaceObjects.size(); i++) {
            if(spaceObjects.get(i).getClass().equals(Star.class)){
                return (Star) spaceObjects.get(i);
            }
        }
        return null;
    }
    public int getSize(){
        int k = 0;
        for (int i = 0; i < spaceObjects.size(); i++) {
            if (spaceObjects.get(i).getClass().equals(Planet.class)) {
                k++;
            }
        }
        return k;
    }
}
