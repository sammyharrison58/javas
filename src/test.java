import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num 1:");
        int num1=input.nextInt();
        System.out.println("choose -,+,*,/");
        char operator=input.next().charAt(0);
        System.out.println("enter num 2:");
        int num2=input.nextInt();
        double result;

        switch(operator){
            case '-':
                result= num1 - num2;
                break;
            case '+':
                result= num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 <= 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    input.close();
                    return;
                }else{
                    result = num1 / num2;
                    }
                break;
            default:
                System.out.println("Invalid operator!");
                input.close();
                return;
        }
        System.out.println("Result: " + result);
        input.close();

    }
}
