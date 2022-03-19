package persons;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {
    private String fullName;
    private String status;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName) &&
                Objects.equals(status, person.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, status);
    }
}
