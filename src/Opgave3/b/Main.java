package Opgave3.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList readLines(String path) throws FileNotFoundException {
        ArrayList lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();

        return lines;
    }

    void main(){

        try{
            readLines("data/namelist.csv");
        }catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet");
        }

    }
}
