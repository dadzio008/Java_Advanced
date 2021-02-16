package OOPzadania.Ex2;

public class Lecturer extends Person{
    Typ specialization;
    float salary;

    public Lecturer(String name, String address, Typ specialization, float salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
