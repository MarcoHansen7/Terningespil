package spil;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int dice1, dice2, sum1, dice3, dice4, sum2, turStarter, spilStarter;
    public static int total1 = (dice1 + dice2);
    public static int total2 = (dice3 + dice4);
    public static String player1, player2, starter, slutter;

    public static void main(String[] args) {

        velkommen();
        tStarter();
        kast();

    }

    static void velkommen() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Velkommen til Dice Game!");

        System.out.println("Player 1 - Indtast navn: ");
        player1 = sc.nextLine();
        System.out.println("Hej " + player1);

        System.out.println("Player 2 - Indtast navn: ");
        player2 = sc.nextLine();
        System.out.println("Hej " + player2);
    }

    static void tStarter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvem starter med at spille? 1 = " + player1 + " og 2 = " + player2);

        loop:
        while (true) {

            turStarter = sc.nextInt();

            switch (turStarter) {
                case 1:
                    System.out.println(player1 + " starter");
                    starter = player1;
                    slutter = player2;
                    break loop;

                case 2:
                    System.out.println(player2 + " starter");
                    starter = player2;
                    slutter = player1;
                    break loop;

                default:
                    System.out.println("Proev igen ven");
                    System.out.print("1 = " + player1 + " starter");
                    System.out.println(" og 2 = " + player2 + " starter");
                    break;
            }

        }
    }


    static void spiller1tur() {
        Random forste = new Random();
        dice1 = forste.nextInt(6);
        dice1++;

        Random anden = new Random();
        dice2 = anden.nextInt(6);
        dice2++;

        sum1 = (dice1 + dice2);
        total1 += (dice1 + dice2);

        if (sum1 == 2)
        {
            total1 = 0;
            System.out.println("Hahahaha du slog 2x1, dine point er blevet nulstillet");
        }

        System.out.println(starter + " slog " + dice1 + " og " + dice2 + " din sum er: " + sum1 + " og din total er. " + total1);
    }

    static void spiller2tur() {
        Random forste = new Random();
        dice3 = forste.nextInt(6);
        dice3++;

        Random anden = new Random();
        dice4 = anden.nextInt(6);
        dice4++;

        sum2 = (dice3 + dice4);
        total2 += (dice3 + dice4);

        if (sum2 == 2)
        {
            total2 = 0;
            System.out.println("Hahahaha du slog 2x1, dine point er blevet nulstillet");
        }

        System.out.println(slutter + " slog " + dice3 + " og " + dice4 + " din sum er: " + sum2 + " og din total er. " + total2);
    }

    static void kast() {
        System.out.println("Nu starter spillet, Tryk 'Any Key + Enter' for at starte");
        Scanner sc = new Scanner(System.in);
        //spilStarter = sc.nextInt();

        loop:
        while (true) {
            //sc.nextLine();
            //spilStarter = sc.nextInt();
            //switch (spilStarter) {
            sc.nextLine();
            //  case 9:
            spiller1tur();
            System.out.println("GODT kastet " + starter);
            // System.out.println(slutter + " tryk på 'Enter' for at spille videre.");
            // sc.nextLine();

            if (total1 >= 40)
            {
                System.out.println(starter + " Har VUNDET!!!!");
                break loop;
            }

            System.out.println(slutter + " tryk på 'Enter' for at spille videre.");
            sc.nextLine();


            //spilStarter = sc.nextInt();
            spiller2tur();
            System.out.println("GODT kastet " + slutter);
            //System.out.println(starter + " tryk på 'Enter' for at spille videre.");

            if (total2 >= 40)
            {
                System.out.println(slutter + " Har VUNDET!!!!");
                break loop;
            }
            //   break;
            System.out.println(starter + " tryk på 'Enter' for at spille videre.");
            //}
        }
    }
}
