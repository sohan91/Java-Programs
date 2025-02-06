public class HourlyEmployee extends Employee{
    private  double hourlypayRate;
    public HourlyEmployee(String name, String birthDate, String hiredDate, double hourlypayRate) {
        super(name, birthDate, hiredDate);
        this.hourlypayRate = hourlypayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlypayRate=" + hourlypayRate +
                "} " + super.toString();
    }

    public void hourlypayRate(int hours)
    {
        if(hours>=8)
        {
            hourlypayRate*=(hours-8);
            System.out.println("Extra payment for extra number of houre is "+hourlypayRate);
            double finalAmount = hourlypayRate*(8+hourlypayRate);
            System.out.println("Final amount including the extra hour payment is "+finalAmount);

        }
        else {
            hourlypayRate *= hours;
            System.out.println("Final payment for worked hours is "+hourlypayRate);
        }
    }


}
