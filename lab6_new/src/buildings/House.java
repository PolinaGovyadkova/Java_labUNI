package buildings;

import java.util.ArrayList;
import java.io.Serializable;

public class House implements  Serializable{
    private int floorsCount;
    private String houseName;

    public int getFloors() {
        return floorsCount;
    }

    public void setFloors(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorsCount=" + floorsCount +
                ", houseName='" + houseName + '\'' +
                '}';
    }
}
