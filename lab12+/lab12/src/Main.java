import hospital.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        final String PATH = "..\\lab12\\hospitalFromMain";

        ArrayList<Hospital> hospitals = new ArrayList<>();

        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("процедуру");
        destinations.add("операцию");
        destinations.add("выдачу лекарств на 2 дня");

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("TreatingDoctor"));
        doctors.add(new Doctor("Nurse"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Patient1", new Doctor("Doctor1"), false));

        String destinationType = doctors.get(0).destination(destinations.get(0));

        doctors.get(1).performingAssignment(destinationType);

        doctors.get(0).discharge(patients.get(0).getPatientSurname(), "Окончание лечения");

        hospitals.add(new Hospital(doctors, patients));

        CustomSAXParser.marshaller(hospitals, PATH);
    }
}
