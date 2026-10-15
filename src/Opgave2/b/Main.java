package Opgave2.b;

import java.util.ArrayList;

public class Main {

    public String getItem(ArrayList<String> items, int index){
        if (index >= items.size() || index < 0){
            throw new IllegalArgumentException("Index '"+index+"' is out of range. The maximum is "+(items.size()-1));
        }
        return items.get(index);
    }

    void main(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Axe");
        list.add("Hammer");
        list.add("Chair");

        try{
            System.out.println(getItem(list, 2));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(getItem(list, 3));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
