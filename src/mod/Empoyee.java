package mod;

import java.util.Objects;

public class Empoyee {
    private final String firstName;
    private final String lastName;

    public Empoyee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empoyee empoyee)) return false;
        return Objects.equals(firstName, empoyee.firstName) && Objects.equals(lastName, empoyee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "mod.Empoyee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
