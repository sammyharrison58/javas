import java.util.Scanner;
public class div7 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a n.o between 1-100");
        int num= input.nextInt();
        if(num<100 && num>0){
            if(num%7==0){
                System.out.println("Number is divisible by 7:");


            }
            else System.out.println("Number is not  divisible by 7:");}
        else System.out.println("Invalid");
        }

    }

