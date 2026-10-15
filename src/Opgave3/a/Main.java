package Opgave3.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> readLines(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();

        scan.nextLine();
        while(scan.hasNextLine()){
            list.add(scan.nextLine());
        }

        return list;
    }


    void main(){

        try{
            ArrayList<String> namesList = readLines("data/namelist.csv");
            for(String list : namesList){
                System.out.println("Name: "+list);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            ArrayList<String> agelist = readLines("data/agelist.csv");
            for(String list : agelist){
                System.out.println("Age: "+agelist);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
