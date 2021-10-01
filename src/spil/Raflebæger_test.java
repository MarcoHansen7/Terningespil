import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
    public class Raflebæger_test {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dice1, dice2, sum1, sumTotal;
            int[] opdel = new int[1000];
            for (int i=0; i <1000 ;i++ ) {
                Random forste = new Random();
                dice1 = forste.nextInt(6);
                dice1++;
                Random anden = new Random();
                dice2 = anden.nextInt(6);
                dice2++;
                sum1 = (dice1+dice2);
                opdel [i]=sum1;
                System.out.println("du slog " + dice1 + " og " + dice2 + " din sum er: " + sum1);
            }

            System.out.println(Arrays.toString(opdel));

            System.out.println("Indtast det tal du vil se hyppigheden på");
            int x = sc.nextInt();
            int gange=0;


            for(int i=0;i<1000;i++) {           //vi laver et for loop med en if-statement for som
                if (x==opdel[i])
                {
                    gange++;
                }
            }

            System.out.println(x+" optrådte "+gange+" gange ");


        }

    }




