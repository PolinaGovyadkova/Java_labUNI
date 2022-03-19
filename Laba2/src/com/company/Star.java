package com.company;

import java.util.Objects;

public class Star extends SpaceObject{
    private String type;

    public Star(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Star star = (Star) o;
        return Objects.equals(type, star.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return super.toString() + "Star: " +
                "type='" + type;
    }
}