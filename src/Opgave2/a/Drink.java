package Opgave2.a;

public class Drink {
    private String name;
    private double price;

    Drink(String name){
        this.name = name;
    }

    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be 0 or above. '"+price+"' is invalid");
        }
        this.price = price;
        System.out.println(name+" price set to "+price+" DKK");
    }
}
