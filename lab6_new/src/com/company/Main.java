package com.company;

import java.util.ArrayList;
import buildings.House;
import designDepartment.Bill;
import designDepartment.Team;
import designDepartment.TechTask;
import persons.Customer;
import persons.Designer;
import serialize.TeamSerialize;

public class Main {

    public static void main(String[] args) throws Exception {
	try{
        print("---TEST FUNCTIONS---");
        Customer customer = new Customer("Zaitzev A.V.", "Customer");
        Designer designer1 = new Designer("Egorov E.A.", "Designer");
        Designer designer2 = new Designer("Larchick K.I.", "Designer");
        Designer designer3 = new Designer("Ivanov I.K.", "Designer");

        print(customer.toString());
        print(designer1.toString());
        print(designer2.toString());
        print(designer3.toString());
        ArrayList<Designer> designers = new ArrayList<>();
        designers.add(designer2);
        designers.add(designer3);
        TechTask techTask = new TechTask("High-rise building", "House with 10 floors");
        Team team = new Team(designer1, designers );
        Bill bill = new Bill(2000000,100000);
        techTask.setBill(bill);
        team.setTechTask(techTask);
        print(team.toString());
        print(techTask.toString());
        print(bill.toString());

        print("\n---SERIALIZE TEST---");

        String filePath = "C:\\Users\\Alex\\Desktop\\save.ser";
        TeamSerialize teamSerialize = new TeamSerialize(new Team[] {team});
        teamSerialize.Serialize(filePath);
        print(team.toString());
        print(team.getTechTask().getBill().toString());
        print("\n---ADD NEW DATA TO TEAM---");

        bill.setDesignCost(150000);
        techTask.setBill(bill);
        team.setTechTask(techTask);
        print(team.toString());
        print(team.getTechTask().getBill().toString());

        print("\n---DESERIALIZE TEST---");
        teamSerialize.Deserialize(filePath);
        Team[] teams = teamSerialize.getTeams();
        print(teams[0].getTechTask().getBill().toString());
        print(teams[0].toString());
    }
    catch (Exception ex){
        System.out.println(ex.getMessage());
    }

    }
    public static void print(String message){
        System.out.println(message);
    }
}
