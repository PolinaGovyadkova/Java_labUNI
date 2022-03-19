package hospital;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("patient")
public class Patient implements Serializable {
    @XStreamAlias("patientSurname")
    private String patientSurname;
    @XStreamAlias("doctor")
    private Doctor doctor;
    @XStreamAlias("isHealthy")
    private boolean isHealthy = false;

    public Patient(String patientSurname, Doctor doctor, boolean isHealthy) {
        this.patientSurname = patientSurname;
        this.doctor = doctor;
        this.isHealthy = isHealthy;
    }

    @Override
    public String toString() {
        return "Фамилия: " + patientSurname +
                "; Лечащий врач: " + doctor +
                "; Состояние: " + isHealthy;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public static void setIsHealthy(boolean isHealthy) {
        isHealthy = isHealthy;
    }
}
