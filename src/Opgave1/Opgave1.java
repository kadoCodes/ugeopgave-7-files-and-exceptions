package Opgave1;

import java.util.Scanner;

public class Opgave1 {
    Scanner scan = new Scanner(System.in);


    public int promptNumber(String msg) {
        System.out.println(msg);

        try{
            return Integer.parseInt(scan.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("Error. Use only whole numbers");
            return promptNumber(msg);
        }

    }

    void main(){
       promptNumber("Write a full number!");

    }


}
