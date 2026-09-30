import java.util.Scanner;
public class calories {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of cookies:");
        int Cookies = input.nextInt();
        int servings=Cookies/4;
        int calories=servings*300;
        System.out.println("Servings:" + servings);
        System.out.println("calories:" + calories);

    }
}
