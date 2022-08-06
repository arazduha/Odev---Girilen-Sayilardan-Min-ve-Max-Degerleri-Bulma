import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int s, s2, mx=1, mn=1;

            System.out.print("Kac tane sayi gireceksiniz: ");
            s = input.nextInt();
            for (int i = 1; i<= s; i++) {
                System.out.print(i + ".sayiyi giriniz: ");
                s2 = input.nextInt();

                if (i == 1){
                    mx = s2;
                    mn = s2;
                }

                if (s2>mx){
                    mx = s2;
                }

                if (s2 < mn){
                    mn = s2;
                }
            }
            System.out.println("En buyuk sayi: "+mx);
            System.out.println("En kucuk sayi: "+mn);

    }

}





