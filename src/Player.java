import java.util.Random;

public class Player {
    //definere variabler
    private int pl;
    private  int score;
    private boolean doublesix;
    private boolean isWin;

    //Constructor: setter variablers value
    public  Player (int player)
    {
       score = 0;
        pl = player;
        doublesix = false;
        isWin = false;
    }
    //metode til at slå terning
    public int slåEnTerning()
    {
        Random rand = new Random();
        int t1=rand.nextInt(6)+1;

        return t1;
    }
    //metode til at tjekke for ekstra slag dobbelt 1 og 2*2 skesere i træk og om man har vundet
    public int Checkterning(int t1, int t2)
    {
        int v = 0;
        if (t1 ==6 && t2 == 6 && doublesix == true)
        {
            isWin = true;

        }
        doublesix = false;
        if (t1 == 1 && t2 == 1)
        {
            System.out.println("Player " + pl+ " slog 1 og 1 og mister derfor alle sine point");
            score = 0;
        }
        else if (t1 == t2 && doublesix != true)
        {
            if (score<40) {
                v = t1;
                System.out.println("Du har slået to ens og får derfor et ekstra slag");
                if (t1 == 6) {
                    doublesix = true;
                }
            }
            else{
                isWin = true;
            }
        }


        return(v);
    }
    //Spil metoden der anvender de andre metoder
    public boolean spil()
    {
        int igen;

        do {
            System.out.println("Spiller "+pl+" tryk enter for at slå terning");
            try{System.in.read();}
            catch(Exception e){}
            int t1 = slåEnTerning();
            int t2 = slåEnTerning();
            addtoscore(t1, t2);
            igen = Checkterning(t1, t2);


        } while (igen > 0);

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
            System.out.println("spiller " + pl + " score er "+score+" og skal slå to ens for at vinde \nSpiller "+pl+" slår " + (t1) + " og " + (t2) );
        }
    }
    //holder øje med om spilleren har vundet
    public boolean hasWon()
    {
        if (isWin == true) {
            System.out.println("Player "+pl+" vinder!");
            return true;
        }
        else {
            return false;
        }
    }
    }


