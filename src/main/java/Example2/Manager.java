package Example2;

public class Manager extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Manager(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public void describe() {
        System.out.println("Jestem menadżerem, nazywam się " + getName() + " "
                + getSurname() + " mam" + getAge() + " lat"
        );
    }
}
