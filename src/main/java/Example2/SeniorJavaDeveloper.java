package Example2;

public class SeniorJavaDeveloper extends JavaDeveloper {
    private int yearsOfExperience;

    public SeniorJavaDeveloper(String name, String surname, int age, int salary, String[] knownTechnologies, int yearsOfExperience) {
        super(name, surname, age, salary, knownTechnologies);
        this.yearsOfExperience = yearsOfExperience;
    }

    public SeniorJavaDeveloper(String name, String surname, int age, int salary, String[] knownTechnologies) {
        super(name, surname, age, salary, knownTechnologies);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void describe() {
        System.out.println("I am senior Java Developer. Nazywam się" + getName()
                + " " + getSurname() + " mam"
                + " " + getAge() + "posiadam"
                + " " + getYearsOfExperience() + "lat doświadczenia"
        );
    }
}
