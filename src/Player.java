import java.util.Random;

public class Player {

    private static int pl;
    private static int score;
    private static boolean doublesix;


    public  Player (int player)
    {
       score = 0;
        pl = player;
        doublesix = false;
    }
    public static int slåEnTerning()
    {
        Random rand = new Random();
        int t1=rand.nextInt(6)+1;

        return t1;
    }
    public static int Checkterning(int t1, int t2)
    {
        int v = 0;
        if (t1 ==6 && t2 == 6 && doublesix == true)
        {
            System.out.println("Player "+pl+" vinder!");
        }
        if (t1 == t2)
        {
            v= t1;
            System.out.println("Du har slået to ens og får derfor et ekstra slag");

        }

        return(v);
    }
    public  static void spil()
    {
        try{System.in.read();}
        catch(Exception e){}
        int igen;
        do {

            int t1 = slåEnTerning();
            int t2 = slåEnTerning();
            addtoscore(t1, t2);
            igen = Checkterning(t1, t2);

        } while (igen > 0);



    }
    public static void addtoscore(int t1, int t2)
    {

        if (score<40) {
            score= score + t1 + t2;
            System.out.println("spiller " + pl + " slår " + (t1) + " og " + (t2) + " spiller " + pl + " score er " + (score));
        }
        else
        {
            System.out.println("spiller " + pl + " score er "+score+" og skal slå to ens for at vinde \nSpiller "+pl+" slår " + (t1) + " og " + (t2) );
        }
    }

}
