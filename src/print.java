import java.util.Scanner;

public class print {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Choose Y for yes and N for No:");
        char here=input.next().charAt(0);
        switch (here){
            case 'Y':
                System.out.println("Yes you are in");
                break;
            case 'y':
                System.out.println("Yes you are in");
                break;
            case 'N':
                System.out.println("No you are out,bye");
                break;
            case 'n':
                System.out.println("No you are out");
                break;
            default:
                System.out.println("invalid");
        }

    }
}
