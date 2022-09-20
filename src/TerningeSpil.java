import java.util.Random;
class TerningeSpil {
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        //variblerne bliver difineret tror jeg
        int terningmax = 6;
        int terningmin = 1;
        int player1=0;
        int player2=0;
        int terning11, terning12, terning21, terning22;

        System.out.println("Hej og velkommen til spil");
        System.out.println("klik enter for at starte, og fortsætte spillet");

        //spil løkken
        while (player1<40 && player2<40){
            //enter for rul
                try{System.in.read();}
                catch(Exception e){}
                //tilfældigt tal fra 0-5 + 1 = terning
            terning11=rand.nextInt(terningmax)+terningmin;
            terning12=rand.nextInt(terningmax)+terningmin;
            //spiller score bliver  opdateret og printet
            player1=player1+terning11+terning12;


            System.out.println("spiller 1 slår "+(terning11)+" og "+(terning12)+" spiller 1 score er "+(player1));

            //samme igen
            try{System.in.read();}
            catch(Exception e){}

            terning21=rand.nextInt(terningmax)+terningmin;
            terning22=rand.nextInt(terningmax)+terningmin;
            player2=player2+terning21+terning22;

            System.out.println("spiller 2 slår "+(terning21)+" og "+(terning22)+" spiller 2 score er "+(player2));
        }
//vi kommer ud af spil løkken når en kommer over 40
        if (player1<player2)
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }}
