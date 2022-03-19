package persons;

import java.io.Serializable;

public class Customer extends Person implements Serializable {
    public Customer() {    }
    public Customer(String fullName, String status){
        setFullName(fullName);
        setStatus(status);
    }
}
