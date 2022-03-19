package designDepartment;

import persons.Designer;

import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable {
    private Designer leader;
    private ArrayList<Designer> designers;
    private TechTask techTask;

    public Designer getLeader() {
        return leader;
    }

    public TechTask getTechTask() {
        return techTask;
    }

    public void setTechTask(TechTask techTask) {
        this.techTask = techTask;
    }

    public void setLeader(Designer leader) {
        this.leader = leader;
    }
    public ArrayList<Designer> getDesigners() {
        return designers;
    }
    public void setDesigners(ArrayList<Designer> designers) {
        this.designers = designers;
    }

    public Team() {}
    public Team(Designer leader, ArrayList<Designer> designers){
        setLeader(leader);
        setDesigners(designers);
    }

    @Override
    public String toString() {
        return "Team{" +
                "leader=" + leader +
                ", designers=" + designers +
                ", techTask=" + techTask +
                '}';
    }
}
