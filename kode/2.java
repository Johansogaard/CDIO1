import java.util.Random;
import java.util.Scanner;

class GenerateRandom {
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        Scanner scan = new Scanner(System.in);
        int terningmax = 6;
        int terningmin = 1;
        int player1=0;
        int player2=0;
        int terning11, terning12, terning21, terning22;
        String inp;

        while (player1<40 && player2<40){

            System.out.println("hej velkommen til spil, skriv rul for spil");

            while(true){
                inp = scan.nextLine();
                System.out.println("vil du rulle skriv rul");
                if ((inp.equalsIgnoreCase("rul"))){
                    break;}
            }


            terning11=rand.nextInt(terningmax)+terningmin;
            terning12=rand.nextInt(terningmax)+terningmin;
            player1=player1+terning11+terning12;

            if (terning11+terning12==2);
            player1=0;

            System.out.println("spiller 1 slår "+(terning11)+" og "+(terning12)+" spiller 1 score er "+(player1));

            terning21=rand.nextInt(terningmax)+terningmin;
            terning22=rand.nextInt(terningmax)+terningmin;
            player2=player2+terning21+terning22;

            if (terning21+terning22==2) {
                System.out.print("0mand");
                player2 = 0;
            }

            System.out.println("spiller 2 slår "+(terning21)+" og "+(terning22)+" spiller 2 score er "+(player2));
        }

        if (player1<player2)
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }}
