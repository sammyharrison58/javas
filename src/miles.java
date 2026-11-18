import java.util.Scanner;

public class miles {
    public static void  main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the miles: ");
        int miles=input.nextInt();
        double km=miles*1.609;
        System.out.println("kilometers: " + km + ("km"));
    }
}
