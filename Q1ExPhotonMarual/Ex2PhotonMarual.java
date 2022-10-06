/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.photon.marual;
import java.util.Scanner;
/**
 *
 * @author PHOTON
 */
public class Ex2PhotonMarual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String choice;
        int num;
        char repeat;
        int numGuess = 3;
        int lowLim = 1;
        int upLim = 10;
        outerLoop:
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start Game");
            System.out.println("-Change Settings");
            System.out.println("-End Application");
            choice = sc.nextLine();
            int random = (int) Math.floor(Math.random()*upLim + lowLim);
            switch(choice) {
                case "Start Game":
                    num = numGuess;
                    System.out.printf("You have %d guess(es) left. What is your guess?", num);
                    for(num = numGuess;num >= 0; num--) {
                       int guess = sc.nextInt();
                       if(guess<random) {
                           System.out.printf("Guess higher! You have %d guess(es) left. What is your guess?", num);
                       }
                       else if(guess==random) {
                           System.out.println("You got it!");
                           break;
                       }
                       else if(guess>random){
                           System.out.printf("Guess lower! You have %d guess(es) left. What is your guess?", num);
                       }
                       if(num==0){
                           System.out.println("You lost...");
                       }
                    }
                    break;
                
                case "Change Settings":
                    System.out.println("What is the lower limit of the random numeber?");
                    System.out.println("What is the upper limit of the random number?");
                    System.out.println("How many guesses are allowed?");
                    System.out.println("Lower Limit: ");
                    lowLim = sc.nextInt();
                    System.out.println("Upper Limit: ");
                    upLim = sc.nextInt();
                    System.out.println("Guesses: ");
                    numGuess = sc.nextInt();
                    break;
                case "End Application":
                    break outerLoop;
                default:
                    System.out.println("Invalid");
                }
            System.out.println("Play Again (y/n)?");
            repeat = sc.next().charAt(0);	
        }
        while(repeat == 'y');
           System.out.println("Thanks for playing");
    }
}
