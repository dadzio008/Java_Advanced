package Example2;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public Employee(String jan, String kowalski, int age) {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Pracownikiem, nazywam się "
                +getName() +" "+getSurname()+
                " i mam "+getAge()+" lat");
    }
}