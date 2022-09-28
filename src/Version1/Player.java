package Version1;

import java.util.Random;

public class Player {
    //definere variabler
    private final int pl;
    private  int score;

    private boolean isWin;

    //Constructor: setter variablers value
    public  Player (int player)
    {
        score = 0;
        pl = player;

        isWin = false;
    }
    //metode til at slå terning
    public int slaEnTerning()
    {
        Random rand = new Random();
        return rand.nextInt(1,7);


    }





    //Spil metoden der anvender de andre metoder
    public boolean spil()
    {

            System.out.println("Spiller "+pl+" tryk enter for at slå terning");
            try{System.in.read();}
            catch(Exception e){}
            int t1 = slaEnTerning();
            int t2 = slaEnTerning();
            addtoscore(t1, t2);
            return hasWon();



    }
    //metoden tilføjer point til spillerens score
    public void addtoscore(int t1, int t2)
    {

        if (score<40) {
            score= score + t1 + t2;
            System.out.println("spiller " + pl + " slår " + (t1) + " og " + (t2) + " spiller " + pl + " score er " + (score));
        }
        else
        {

            isWin = true;
        }
    }
    //holder øje med om spilleren har vundet
    public boolean hasWon()
    {
        if (isWin ) {
            System.out.println("spil.Player "+pl+" vinder!");
            return true;
        }
        else {
            return false;
        }
    }
}


