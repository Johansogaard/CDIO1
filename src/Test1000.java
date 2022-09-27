import java.util.Random;

public class Test1000 {
    public static void main(String[] args) {
        Random rand = new Random();
        int terningmax = 6;
        int terningmin = 1;
        int terning1, terning2;
        int res2 = 0, res3 = 0, res4 = 0, res5 = 0, res6 = 0, res7 = 0, res8 = 0, res9 = 0, res10 = 0, res11 = 0, res12 = 0;


        for(int i = 0; i < 1000; ++i) {
            terning1=rand.nextInt(terningmax)+terningmin;
            terning2=rand.nextInt(terningmax)+terningmin;
            int samlet = terning1 + terning2;
            //måske lidt for simpel kode
            if (samlet == 2){res2 ++;}
            if (samlet == 3){res3 ++;}
            if (samlet == 4){res4 ++;}
            if (samlet == 5){res5 ++;}
            if (samlet == 6){res6 ++;}
            if (samlet == 7){res7 ++;}
            if (samlet == 8){res8 ++;}
            if (samlet == 9){res9 ++;}
            if (samlet == 10){res10 ++;}
            if (samlet == 11){res11 ++;}
            if (samlet == 12){res12 ++;}
            //men det virker :)

        }
        System.out.println("samlet antal 2'ere: " + res2 +" procent: " + Math.ceil(res2)/10 + "%");
        System.out.println("samlet antal 3'ere: " + res3 +" procent: " + Math.ceil(res3)/10 + "%");
        System.out.println("samlet antal 4'ere: " + res4 +" procent: " + Math.ceil(res4)/10 + "%");
        System.out.println("samlet antal 5'ere: " + res5 +" procent: " + Math.ceil(res5)/10 + "%");
        System.out.println("samlet antal 6'ere: " + res6 +" procent: " + Math.ceil(res6)/10 + "%");
        System.out.println("samlet antal 7'ere: " + res7 +" procent: " + Math.ceil(res7)/10 + "%");
        System.out.println("samlet antal 8'ere: " + res8 +" procent: " + Math.ceil(res8)/10 + "%");
        System.out.println("samlet antal 9'ere: " + res9 +" procent: " + Math.ceil(res9)/10 + "%");
        System.out.println("samlet antal 10'ere: " + res10 +" procent: " + Math.ceil(res10)/10 + "%");
        System.out.println("samlet antal 11'ere: " + res11 +" procent: " + Math.ceil(res11)/10 + "%");
        System.out.println("samlet antal 12'ere: " + res12 +" procent: " + Math.ceil(res12)/10 + "%");
    }
}
