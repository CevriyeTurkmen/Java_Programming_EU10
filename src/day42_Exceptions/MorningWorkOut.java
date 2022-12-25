package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("-------------Push up started----------------");
        for (int i = 0; i <= 30; i++) {

            System.out.print("\rPush Up " + i);
           sleep(0.5);

        }

        System.out.println("\nPush Up completed");

        System.out.println("-------------Pull up started----------------");
        for (int i = 0; i <= 20; i++) {

            System.out.print("\rPull Up " + i);
           sleep(0.4);

        }

        System.out.println("\nPull up completed");
    }

        public static void sleep(double seconds) {

            try {
                Thread.sleep((long)(seconds*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }

