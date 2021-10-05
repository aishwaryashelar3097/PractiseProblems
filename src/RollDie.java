import java.io.*;

public class RollDie {


public static void main (String args [] ) throws IOException {
	System.out.println(input()); }

int i, n=1000 ; 
int Sixside1;
int count4 = 0;
int [] data = new int [1000];


public static int input () throws IOException {
    BufferedReader myInput = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Hello and welcome to the program");
    System.out.println("In this program six sided dices will be rolled  (n times ");

    System.out.println("The dices will be rolled to determine the odds of how many times the roll 4 comes up on both dies(Press any key to con't) ");
    myInput.readLine();
    int count4=0;
    for (int i = 0; i < 1000; i++) 
    {
        if ( (int)(Math.random ()*6+1)+(int)(Math.random ()*6+1) == 4) {
            count4++;
        }
    }
    return count4;
}
}
