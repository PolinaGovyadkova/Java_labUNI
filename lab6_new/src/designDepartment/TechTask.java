package designDepartment;

import java.io.Serializable;
import java.util.Objects;

public class TechTask implements Serializable {
    private String techTaskName;
    private String techTaskInfo;
    private Bill bill;

    public String getTechTaskInfo() {
        return techTaskInfo;
    }

    public String getTechTaskName() {
        return techTaskName;
    }

    public void setTechTaskInfo(String techTaskInfo) {
        this.techTaskInfo = techTaskInfo;
    }

    public void setTechTaskName(String techTaskName) {
        this.techTaskName = techTaskName;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public TechTask() {
    }
    public TechTask(String techTaskName, String techTaskInfo){
        setTechTaskInfo(techTaskInfo);
        setTechTaskName(techTaskName);
    }

    @Override
    public String toString() {
        return "TechTask{" +
                "techTaskName='" + techTaskName + '\'' +
                "bill='" + bill + '\'' +
                ", techTaskInfo='" + techTaskInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechTask techTask = (TechTask) o;
        return Objects.equals(techTaskName, techTask.techTaskName) &&
                Objects.equals(techTaskInfo, techTask.techTaskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(techTaskName, techTaskInfo);
    }

}
