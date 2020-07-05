package Metoring._09_;

import java.util.Random;
import java.util.Scanner;

public class dsadasd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        Boolean correct = false;
        int attempts = 0;
        do{
            if (attempts == 3) {
                System.out.println("rerun the program");
                break;
            }
            System.out.println("Enter number 1-9");
            int ans = in.nextInt();
            if (ans == num) {
                correct = true;
                System.out.println("Correct! the number is: " + ans);
            } else {
                attempts++;
            }
        }while(!correct);
    }
}
