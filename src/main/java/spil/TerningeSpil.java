package spil;

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
            if (p1w == true) {
                break;
            }
            p2w = pl2.spil();
            if (p2w == true) {
                break;
            }
        }
    }
}


