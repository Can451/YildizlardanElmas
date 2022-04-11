import java.util.Scanner;

public class YıldızProje {
    public static void main(String[] args) {
        //6 satır n
        //1,3,5,7,9,11 yıldız
        //5,4,3,2,1 n-i

        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi = inp.nextInt();

        for (int i=0; i<=sayi; i++){
            for (int j=0;j<=(sayi-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }


            System.out.println(" ");

        }


        //6 satır n
        //1,3,5,7,9,11 yıldız
        //0,1,3,5,7
        for (int i=1;i<=sayi;i++){
            for (int k=0;k<i+1;k++){
                System.out.print(" ");
            }
            for (int j=i;j<sayi*2-(i+1);j++){
                System.out.print("*");
            }





            System.out.println(" ");
        }
    }
}
