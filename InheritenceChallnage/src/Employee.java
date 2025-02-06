public class Employee extends Worker {
    private long employeeId;
    private String hiredDate;
    private static int  countId =101;
    public Employee()
    {

    }

    public Employee(String name, String birthDate, String hiredDate) {
        super(name, birthDate);
        this.employeeId = countId++;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hiredDate='" + hiredDate + '\'' +
                "} " + super.toString();
    }


}
