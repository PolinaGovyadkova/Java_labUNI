package com.company;

import java.util.Objects;

public class Planet extends SpaceObject {
    private int weight;
    private boolean isInhabited;

    public Planet(int id, String name) {
        super(id, name);
    }

    public Planet(int id, String name, int weight, boolean isInhabited) {
        super(id, name);
        this.weight = weight;
        this.isInhabited = isInhabited;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isInhabited() {
        return isInhabited;
    }

    public void setInhabited(boolean inhabited) {
        isInhabited = inhabited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Planet planet = (Planet) o;
        return weight == planet.weight &&
                isInhabited == planet.isInhabited;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, isInhabited);
    }

    @Override
    public String toString() {
        return super.toString() + "Planet: " +
                "weight=" + weight +
                ", isInhabited=" + isInhabited;
    }
}