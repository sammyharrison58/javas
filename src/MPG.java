import java.util.Scanner;
public class MPG {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter miles driven:");
        int miles= input.nextInt();
        System.out.println("Enter galons used:");
        int galons= input.nextInt();
        int MPGs=miles/galons;
        System.out.println("miles per galons:" + MPGs);

    }
}
