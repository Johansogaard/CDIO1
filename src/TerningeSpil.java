
import java.util.Random;
class TerningeSpil {
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        //variablerne bliver defineret tror jeg, thats right
        int terningmax = 6;
        int terningmin = 1;
        int player1=0; //player 1 score
        int player2=0; //player 2 score
        int terning11=0, terning12=0, terning21=0, terning22=0; //terning
        int pterning1=0, pterning2=0;

        System.out.println("Hej og velkommen til spil");
        System.out.println("klik enter for at starte, og fortsætte spillet");

        //spil løkken
        outerloop: while (true){

            //tryk enter for rul
                try{System.in.read();}
                catch(Exception e){}

                //tilfældigt tal fra 0-5 + 1 = terning
            terning11=rand.nextInt(terningmax)+terningmin;
            terning12=rand.nextInt(terningmax)+terningmin;
            player1=player1+terning11+terning12;
            System.out.println("spiller 1 slår "+(terning11)+" og "+(terning12)+" spiller 1 score er "+(player1));


            //terning11+terning12
            //spiller score bliver  opdateret og printet

//6'ere to gange
            if (terning11+terning12==pterning1 && pterning1==12)
                break;
            pterning1=terning11+terning12;
            // der bliver testet om der er blevet slået to ens efter 40

            if ((player1>40 && terning11==terning12))
                break;


            //dobbelt 1
            if (terning11==1 && terning12==1) {
                System.out.println("to 1'ere, tilbage til start");
                player1 = 0;
            }
            //dobbelt ens
            if (terning11==terning12) {
                System.out.println("to ens, ekstra tur ");
                try{System.in.read();}
                catch(Exception e){}

                //tilfældigt tal fra 0-5 + 1 = terning
                terning11=rand.nextInt(terningmax)+terningmin;
                terning12=rand.nextInt(terningmax)+terningmin;


                //spiller score bliver  opdateret og printet
                player1=player1+terning11+terning12;
                System.out.println("spiller 1 slår "+(terning11)+" og "+(terning12)+" spiller 1 score er "+(player1));
                // kan ikke lave double break
                if (terning11+terning12==pterning1 && pterning1==12)
                    break outerloop;
                pterning1=terning11+terning12;

                if (terning11==1 && terning12==1) {
                    System.out.println("to 1'ere, tilbage til start");
                    player1 = 0;
            }
            if ((player1>40 && terning11==terning12) ) //
                break;




            //samme igen
            try{System.in.read();}
            catch(Exception e){}

            terning21=rand.nextInt(terningmax)+terningmin;
            terning22=rand.nextInt(terningmax)+terningmin;
            player2=player2+terning21+terning22;

            System.out.println("spiller 2 slår "+(terning21)+" og "+(terning22)+" spiller 2 score er "+(player2));

                if (terning21+terning22==pterning2 && pterning2==12)
                    break;
                pterning2=terning21+terning22;

            if ((player2>40 && terning11==terning12) ) //
                break;

            if (terning21+terning22==2) {
                System.out.println("to 1'ere, tilbage til start");
                player2 = 0;
            }
            if (terning21==terning22) {
                System.out.println("to ens, ekstra tur ");
                try{System.in.read();}
                catch(Exception e){}

                //tilfældigt tal fra 0-5 + 1 = terning
                terning21=rand.nextInt(terningmax)+terningmin;
                terning22=rand.nextInt(terningmax)+terningmin;
                //spiller score bliver  opdateret og printet
                player2=player2+terning21+terning22;

                System.out.println("spiller 2 slår "+(terning21)+" og "+(terning22)+" spiller 2 score er "+(player2));

                if (terning11+terning12==pterning1 && pterning1==12)
                    break outerloop;
                pterning1=terning11+terning12;

                if (terning21+terning22==2) {
                    System.out.println("to 1'ere, tilbage til start");
                    player2 = 0;
            }

            if ((player2>40 && terning11==terning12) ) //|| (player2>40 && terning21==terning22)
                break;
        }}}
//vi kommer ud af spil løkken når en kommer over 40
        if (terning21==terning22 || pterning2==terning21+terning22)
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }}
