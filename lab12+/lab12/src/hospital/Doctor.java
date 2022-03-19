package hospital;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("doctor")
public class Doctor implements Serializable {
    @XStreamAlias("doctorSurname")
    private String doctorSurname;

    public Doctor(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String destination(String destinationType) {
        if (!destinationType.equals("")) {
            System.out.println(doctorSurname + " назначил " + destinationType);
        } else {
            System.out.println(doctorSurname + " ничего не назначил");
        }

        return destinationType;
    }

    public void performingAssignment(String destinationType) {
        if (!destinationType.equals("")) {
            System.out.println(doctorSurname + " выполняет " + destinationType);
        } else {
            System.out.println("Врач ничего не назначал");
        }
    }

    public void discharge(String patientSurname, String dischargeType) {
        System.out.println(doctorSurname + " выписал " + patientSurname + ". Причина: " + dischargeType);
        Patient.setIsHealthy(true);
    }

    @Override
    public String toString() {
        return doctorSurname;
    }
}
