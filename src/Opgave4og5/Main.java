package Opgave4og5;

import java.util.ArrayList;

public class Main {

    void main(){
        double totalPrice = 0;
        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");


        for(String list : data){
            String[] values = list.split(",");
            String beverage = values[0].trim();
            String description = values[1].trim();
            try{
                double price = Double.parseDouble(values[2].trim());
                System.out.println(beverage+" - "+description+" ("+price+" DKK)");
                totalPrice += price;
            }catch(NumberFormatException e){
                System.out.println("Couldn't read price: "+values[2].trim()+" for beverage: "+values[0].trim());
            }

        }

        System.out.println("The total price for all beverages is: "+totalPrice+" DKK");


    }
}
