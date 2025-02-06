public class Employee {
    private String name;
    private int id;
    public int experience;

    public Employee(int id, String name, int experience) {
        this.id = id;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return getClass().getName()+" id is " + " "+id+" "+ name.toUpperCase() + " " + experience + " years of experience";
    }

    class Developers extends Employee {
        private double salary;

        public Developers(int id, String name, int experience, double salary) {
            super(id, name, experience);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return super.toString() + "\nSalary: " + salary;
        }
    }

    public String form(Employee e, double salary) {
        return e.getClass().getName() + "(" + getClass().getName() + ") , " + e.name.toUpperCase() + " " + e.experience + " " + this.toString();
    }
    record Nemployee1(String name,int id, int experience,double salary)
    {

    }
}
