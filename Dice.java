import javax.print.attribute.standard.Sides;
import java.util.Random;


public class Dice {

    public int playerRoll;
    public int value;
    public Dice(){
    }

    public int playerRoll(int num) {

        value = (int) (Math.random() * num) + 1;
        //System.out.println("This is it " + value);
        return playerRoll;
    }



    //public abstract void playerRoll(;





/*
    public void rollD4(){
        System.out.println("Four Sided Dice Roll: ");
        d4 = (int)(Math.random() * 4) + 1;
        System.out.print("With the Four sided die you rolled a " + d4);
    }

    public void rollD6(){
        System.out.println("Six Sided Dice Roll: ");
        d6 = (int)(Math.random() * 6) + 1;
        System.out.print("With the Six sided die you rolled a "+ d6);
    }

    public void rollD8(){
        System.out.println("Eight Sided Dice Roll: ");
        d8 = (int)(Math.random() * 8) + 1;
        System.out.print("With the Eight sided die you rolled a " + d8);
    }

    public void rollD10(){
        System.out.println("Ten Sided Dice Roll: ");
        d10 = (int)(Math.random() * 10) + 1;
        System.out.print("With the Ten sided die you rolled a " + d10);
    }

    public void rollD12(){
        System.out.println("Twelve Sided Dice Roll: ");
        d12 = (int)(Math.random() * 12) + 1;
        System.out.print("With the Twelve sided die you rolled a " + d12);
    }

    public void rollD20(){
        System.out.println("Twenty Sided Dice Roll: ");
        d20 = (int)(Math.random() * 20) + 1;
        System.out.print("With the Twenty sided die you rolled a " + d20);
    }

    public int getD4Roll(int D4){
        return d4;
    }

    public int getD6Roll(int D6){
        return d6;
    }

    public int getD8Roll(int D8){
        return d8;
    }

    public int getD10Roll(int D10){
        return d10;
    }

    public int getD12Roll(int D12){
        return d12;
    }

    public int getD20Roll(int D20){
        return d20;
    }

    public int getNumRolls(){
        return numRolls;
    }

*/



}
