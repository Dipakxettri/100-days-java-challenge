
//Guess The Number Game OPPS Edition

import java.util.Random;
import java.util.Scanner;

//class
class GuessGame{
    
    //Sacanner object
    Scanner sc = new Scanner(System.in);
    
    //variables
    private int ask;
    private boolean isWin = false;
     
    //Random object
    Random random = new Random();
        private int ans = random.nextInt(9) + 1; // Generates a number between 1 and 9
    
    //Functions
    //Function for condition whatever a player did win or not
    public void conditionals(){
        if(ask<ans){
            System.out.println(" Try more high number");
            isWin = false;
        }
        else if(ask>ans){
            System.out.println(" Try more low number");
            isWin = false;
        }
        else{
            System.out.println(" You win");
            isWin = true;
        }
    }
    
    //function for loop if user have gave a wrong answer
    public void main(){
        while(!isWin){
            System.out.print(" Guess the num between 1 to 9  :");
            int a = sc.nextInt();
            ask = a;
            conditionals();
    }
    }
}

//Main Program
public class Main {
    
    public static void main(String[] args) {
        
        //objects
        GuessGame gg = new GuessGame();
        
        //Calling function
        gg.main();
        
        
    }
    
}


