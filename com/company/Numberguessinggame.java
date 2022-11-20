package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int computerNo(){
        return computer;
    }
}
public class Numberguessinggame {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NO. Guess");
        }
        else if(i>j){
            System.out.println("Your No. is Big than computer No.");
        }
        else {
            System.out.println("Your No. is Small than computer No.");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
        if(itteration<=10)
        {isCorrectNumber(user, computer);
            itteration++;

        }
        else{
            System.out.println(" LIMIT IS EXCEEDS, Kindly Guess the number in 10 iterations "+"Your Score is :"+itteration);
            break;
        }
            
        }while (user!=computer);
        if (itteration<=10) 
        {
            System.out.println("YOU GUESS NO IN "+ itteration+" ITTERATIONS");
        }
        
    }
}