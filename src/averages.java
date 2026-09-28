import java.util.Scanner;
public class averages {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter score1:");
        int Score1=input.nextInt();
        System.out.println("Enter score2:");
        int Score2=input.nextInt();
        System.out.println("Enter score3:");
        int Score3=input.nextInt();
        float AVg= (Score1+Score2+Score3)/3;
        System.out.println("average is:" + AVg);

    }
}
