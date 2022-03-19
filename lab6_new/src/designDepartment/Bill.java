package designDepartment;

import java.io.Serializable;
import java.util.Objects;

public class Bill implements Serializable {
    private int buildCost;
    private int designCost;

    public int getBuildCost() {
        return buildCost;
    }

    public int getDesignCost() {
        return designCost;
    }

    public void setBuildCost(int buildCost) {
        this.buildCost = Math.abs(buildCost);
    }

    public void setDesignCost(int designCost) {
        this.designCost = Math.abs(designCost);
    }
    public Bill(){}
    public Bill(int buildCost, int designCost){
        setBuildCost(buildCost);
        setDesignCost(designCost);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "buildCost=" + buildCost +
                ", designCost=" + designCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return buildCost == bill.buildCost &&
                designCost == bill.designCost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildCost, designCost);
    }
}
