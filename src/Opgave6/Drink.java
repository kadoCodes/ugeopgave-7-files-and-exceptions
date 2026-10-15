package Opgave6;

public class Drink {
    private String name;
    private int price;
    private int soldNumber;

    Drink(String name, int price, int soldNumber){
        this.name = name;
        this.price = price;
        this.soldNumber = soldNumber;
    }

    void setSoldNumber(int soldNumber){
        this.soldNumber += soldNumber;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return name+", "+price+", "+soldNumber;
    }
}
