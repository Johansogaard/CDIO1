import java.util.Random; //random
class GenerateRandom {
    public static void main( String args[] ) {
        Random rand = new Random();
        //objekter bliver loaded tror jeg
        int terningmax = 6;
        int terningmin = 1;
        int player1=0;
        int player2=0;
        int terning11, terning12, terning21, terning22;

        while (player1<40 && player2<40){ //hoved løkke

            // player 1, to terning og opdatering
            terning11=rand.nextInt(terningmax)+terningmin;
            terning12=rand.nextInt(terningmax)+terningmin;
            player1=player1+terning11+terning12;

            // player 2, to terning og opdatering
            terning21=rand.nextInt(terningmax)+terningmin;
            terning22=rand.nextInt(terningmax)+terningmin;
            player2=player2+terning21+terning22;

            System.out.println("spiller 1 slår "+(terning11)+" og "+(terning12)+" spiller 1 score er "+(player1));

            System.out.println("spiller 2 slår "+(terning21)+" og "+(terning22)+" spiller 2 score er "+(player2));

        }
        //vinder
        if (player1<player2)
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }}