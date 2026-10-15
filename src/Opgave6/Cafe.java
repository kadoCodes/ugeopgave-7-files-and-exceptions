package Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<Drink> coffeeMenu = new ArrayList<>();

    public void loadData(){
        File file = new File("data/menu.csv");

        try{
            Scanner scan = new Scanner(file);

            scan.nextLine(); //Skipping header
            while (scan.hasNextLine()){
                String lines = scan.nextLine();
                String[] values = lines.split(","); //Name, Price, SoldNumber
                String names = values[0].trim();
                int price = Integer.parseInt(values[1].trim());
                int soldNumber = Integer.parseInt(values[2].trim());

                coffeeMenu.add(new Drink(names, price, soldNumber));
            }


        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't find file - "+e);
        }
        catch(NumberFormatException e){
            System.out.println("Couldn't convert number -"+e);
        }

    }

    public void saveData(){
        File file = new File("data/menu.csv");


        try{
            Scanner scan = new Scanner(file);
            String header = scan.nextLine(); //saving the header
            scan.close();


            FileWriter writeFile = new FileWriter(file);
            writeFile.write(header + "\n"); //writing the header back on first line

            for (int i = 0; i < coffeeMenu.size(); i++){
                 writeFile.write(coffeeMenu.get(i).toString()+"\n"); //writing the list back one by one and going to next line
            }

            writeFile.close();


        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }


    public void showMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Here's our menu, pick one!\n");
        for (int i = 0; i < coffeeMenu.size(); i++){
            System.out.println((i + 1) + ". "+coffeeMenu.get(i).toString());
        }

        int input = scan.nextInt();
        scan.nextLine();

        coffeeMenu.get(input - 1).setSoldNumber(1);

    }
}
