package Opgave2.a;

public class Main {


     void main(){

         Drink cola = new Drink("Cola");

         try{
             cola.setPrice(-1);
         }
         catch(IllegalArgumentException e){
             System.out.println(e.getMessage());
         }

         try{
             cola.setPrice(10);
         }
         catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }




     }


}
