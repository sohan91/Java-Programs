public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    @Override
    public double collectPay() {
        double paycheck = annualSalary/12;
        double adjustPay = (isRetired)?0.9*paycheck:paycheck;
        return adjustPay;
    }

    public SalariedEmployee(String name, String birthDate, String hiredDate, double annualSalary, boolean isRetired)
    { super(name, birthDate, hiredDate);
        this.isRetired= isRetired;
        this.annualSalary=annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire() {

         terminate("25/05/2029");
         isRetired=true;
    }
}