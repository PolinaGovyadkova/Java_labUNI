package hospital;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.ArrayList;

@XStreamAlias("hospital")
public class Hospital implements Serializable {
    @XStreamAlias("doctors")
    private ArrayList<Doctor> doctors;
    @XStreamAlias("patients")
    private ArrayList<Patient> patients;

    public Hospital(ArrayList<Doctor> doctors, ArrayList<Patient> patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    @Override
    public String toString() {
        return doctors.toString() + "\n" + patients.toString();
    }
}
