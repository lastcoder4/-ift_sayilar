import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max;
        System.out.println("lutfen hangi sayiya kadar işlem yapılmasını istediğinizi belirtiniz :");
        max = inp.nextInt();
        int i ;
        int sum = 0;
        int adet = 0;
        for(i = 0; i < max; i+=2)
        {
            if(i %3 == 0 && i % 4 == 0)
            {
                sum = sum + i;
                adet++;

            }
            System.out.println(" " +i);

        }

        double sonuc = sum / adet;
        System.out.println("aralıktaki sayılardan 3 ve 4 e tam bölünenlerin ortalaması şu şekildedir : " + sonuc);
    }
}