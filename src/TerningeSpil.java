
import java.util.Random;
class TerningeSpil {
    public static void main(String args[]) {


        //Laver nye instancer af player
        Player pl1 = new Player(1);
        Player pl2 = new Player(2);
        //definerer variabler
        boolean p1w = false;
        boolean p2w = false;
        System.out.println("Hej og velkommen til spil");
        System.out.println("klik enter for at starte, og fortsætte spillet");
        //while løkken som anvender metoden spil i player klassen
        while (true) {
            p1w = pl1.spil();
            if (p1w== true)
            {
                break;
            }
            p2w = pl2.spil();
            if (p2w == true)
            {
                break;
            }
        }



        /*variblerne bliver difineret tror jeg
        int terningmax = 6;
        int terningmin = 1;
        int player1 = 0; //player 1 score
        int player2 = 0; //player 2 score
        int terning11 = 0, terning12 = 0, terning21 = 0, terning22 = 0; //terning
        int pterning1 = 0, pterning2 = 0;
\*
/*
        //spil løkken
        outerloop: while (true){

            //enter for rul
                try{System.in.read();}
                catch(Exception e){}

                //tilfældigt tal fra 0-5 + 1 = terning
            //terning11+terning12
            //spiller score bliver  opdateret og printet


            terning11=player1+slåEnTerning();
            terning12= player1+slåEnTerning();
            System.out.println("spiller "+ spiller+" slår "+(t1)+" og "+(t2)+" spiller 1 score er "+(point));

                int t2=rand.nextInt(6)+1;
            int sum =point+ t1 + t2;

            if(t1 == t2)
            {
                System.out.println("Du har slået to ens og får derfor et ekstra slag");
            }
            return sum;



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
                try {
                    System.in.read();
                } catch (Exception e) {
                }

                //tilfældigt tal fra 0-5 + 1 = terning
                terning11 = rand.nextInt(terningmax) + terningmin;
                terning12 = rand.nextInt(terningmax) + terningmin;


                //spiller score bliver  opdateret og printet
                player1 = player1 + terning11 + terning12;
                System.out.println("spiller 1 slår " + (terning11) + " og " + (terning12) + " spiller 1 score er " + (player1));
                // kan ikke lave double break
                if (terning11 + terning12 == pterning1 && pterning1 == 12)
                    break outerloop;
                pterning1 = terning11 + terning12;

                if (terning11 == 1 && terning12 == 1) {
                    System.out.println("to 1'ere, tilbage til start");
                    player1 = 0;
                }
                if ((player1 > 40 && terning11 == terning12))
                    break;
            }



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

            if ((player2>40 && terning21==terning22) ) //
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

                if (terning21+terning22==pterning2 && pterning2==12)
                    break outerloop;
                pterning2=terning21+terning22;

                if (terning21+terning22==2) {
                    System.out.println("to 1'ere, tilbage til start");
                    player2 = 0;
            }


        }
            if ((player2>40 && terning21==terning22) ) //
                break;
        }
//vi kommer ud af spil løkken når en kommer over 40


        if ((player2>40 && terning21==terning22) || (pterning2==terning21+terning22 && pterning2==12)) //bug
            System.out.println("player 2 vinder med "+(player2));
        else
            System.out.println("player 1 vinder med "+(player1));
    }
    public static int slåEnTerning()
    {
        Random rand = new Random();
        int t1=rand.nextInt(6)+1;

        return t1;
    }
    public static int Checkterning(int t1, int t2)
    {

    }*/
    }
}
