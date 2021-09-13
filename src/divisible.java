import java.util.Scanner;

public class divisible {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter an integer number:");
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
         if (x % 2==0){
             System.out.println("The integer number you entered is divisible by 2");
         }
         else{
             System.out.println("The integer number you entered is not divisible by 2");
             if(x % 5==0){
                 System.out.println("The integer number you entered is divisible by 5");
             } 
             else{
                 System.out.println("The interger number you entered is not divisible by 5");
             }
        }

    }
}