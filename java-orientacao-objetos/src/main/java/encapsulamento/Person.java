package encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String name, int day, int month, int year) {
        this.name =name;
        this.birthDate=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

   public int calculateAge() {

        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return age;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
