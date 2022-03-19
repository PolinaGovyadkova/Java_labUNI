package persons;

import designDepartment.TechTask;

import java.io.Serializable;

public class Designer extends Person implements Serializable {

    public Designer() {    }
    public Designer(String fullName, String status){
        setFullName(fullName);
        setStatus(status);
    }
}
