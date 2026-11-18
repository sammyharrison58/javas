import java.util.Scanner;
public class years {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age in years: ");
        int age = input.nextInt();
        double days= age*365;
        double months=age*12;
        System.out.println("Age in days: " + days);
        System.out.println("Age in months: " + months);

    }
}
