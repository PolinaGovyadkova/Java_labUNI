package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import designDepartment.Team;

public class TeamSerialize {
    private Team[] teams;

    public TeamSerialize(Team[] teams){
        this.teams = teams;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public void Serialize(String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            oos.writeObject(teams);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void Deserialize(String filePath){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath)))
        {
            teams =(Team[])ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
