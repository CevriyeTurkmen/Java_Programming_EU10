package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

Honda honda= new Honda("Jazz","blue",2010,5000);
Audi audi=new Audi("Q7","Blue",2020,12000);
Tesla tesla=new Tesla("3","white",2021,30000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.start();







    }
}
