public class TerningeSpilTest {
    public static void main(String[] args) {
        Player pl1 = new Player(1);
        int[] antal = new int[6];
        for (int i= 0; i < 1000; i++)
        {
            antal[pl1.slaEnTerning()-1] +=1;

        }
        for (int i= 0; i< 6;i++)
        {
            System.out.println("Antal "+i+ ": "+antal[i]+" Fejlmargen er "+ (((1000.0/6)-antal[i])/(1000.0))*100.0);
        }

    }
}
