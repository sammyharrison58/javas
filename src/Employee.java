public class Employee {
    public String name;
    public String address;
    public int number;
    public int SSN;
    public double salary;

    public void mailcheck() {
        System.out.println("mailing check to " + name + "\n" + address);
    }
    public double computepay()
    {
        return salary/152;
    }
}
