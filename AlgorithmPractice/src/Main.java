import java.util.Scanner;

public class Main {

    public static void main (String args[]){

        int x= 0;
        int factorial=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Etnter a posistive integer");
        x = in.nextInt();
        for (int i= x; i>0; i--){
            while ((x-1)!=0){
                factorial*=x;
                x--;
            }
        }

        System.out.println("Factorial is: "+ factorial);
    }
}
