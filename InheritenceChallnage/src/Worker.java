public class Worker {
    private  String name;
    private  String birthDate;
    private  String endDate;
public Worker()
{

}
    public Worker( String name,String birthDate) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }


    public int getAge()
    {
             int current = 2024;
              int dateOfBirth=Integer.parseInt(birthDate.substring(6));
              return (current-dateOfBirth);
    }
    public double collectPay()
    {
              double payment = 900;
              return payment;
    }
    public void terminate(String endDate)

    {
      this.endDate=endDate;
    }


}
