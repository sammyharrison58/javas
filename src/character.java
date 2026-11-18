import java.util.Scanner;
public class character {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char character =  input.next().charAt(0);
        switch (character) {
            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
                System.out.println("lower case");
                break;
            case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z':
                System.out.println("upper case");
                break;

            default:
                System.out.println("Invalid operator!");
                input.close();
                return;
        }

        input.close();
    }


   
}
