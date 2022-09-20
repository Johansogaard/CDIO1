import java.util.Random;
class TerningeSpil {
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        //variblerne bliver difineret tror jeg
        int terningmax = 6;
        int terningmin = 1;
        int player1=0;
        int player2=0;
        int terning1, terning2;
        int cplayer=player1;


        System.out.println("Hej og velkommen til spil");
        System.out.println("klik enter for at starte, og fortsætte spillet");

        //spil løkken
        while (player1<40 && player2<40){
            //enter for rul
                try{System.in.read();}
                catch(Exception e){}
                //tilfældigt tal fra 0-5 + 1 = terning
            terning1=rand.nextInt(terningmax)+terningmin;
            terning2=rand.nextInt(terningmax)+terningmin;
            //spiller score bliver  opdateret og printet
            cplayer=cplayer+terning1+terning2;

            System.out.println((cplayer)+" slår "+(terning1)+" og "+(terning2)+" spiller 1 score er "+(cplayer));

            //dobbelt 1
            if (terning1==1 && terning2==1) {
                System.out.println("to 1'ere, tilbage til start");
                player1 = 0;
            }
            //dobbelt ens
            if (terning1==terning2) {
                System.out.println("to ens, ekstra tur ");
                try{System.in.read();}
                catch(Exception e){}

                //tilfældigt tal fra 0-5 + 1 = terning
                terning1=rand.nextInt(terningmax)+terningmin;
                terning2=rand.nextInt(terningmax)+terningmin;
                //spiller score bliver  opdateret og printet
                cplayer=cplayer+terning1+terning2;
                System.out.println((cplayer)+" slår "+(terning1)+" og "+(terning2)+" spiller 1 score er "+(cplayer));
            }
            if (cplayer==player1)
                    cplayer=player2;
            else
                cplayer=player1;
            }
        }
//vi kommer ud af spil løkken når en kommer over 40
        if (player1<player2)
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }}
