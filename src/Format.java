import java.util.Scanner;
public class Format {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("num:" + i + "sum" + (i+(i++)));

        }

    }
}
