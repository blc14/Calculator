

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int n1 , n2, select;
Scanner input = new Scanner(System.in);
    System.out.println("İlk sayıyı giriniz");
    n1=input.nextInt();
    System.out.println("İkinci sayıyı giriniz");
    n2=input.nextInt();

    System.out.println("Toplama için 1 \n Çıkarma için 2 \n Çarpma için 3 \n Bölme için 4");
    System.out.println("Seçiminiz: ");
    select=input.nextInt();

        if(select==1){
            System.out.println("Toplam=  "+(n1+n2));
        }
else if (select==2){
            System.out.println("Çıkarma=  "+(n1-n2));
        }
else if (select==3){
            System.out.println("Çarpım=  "+(n1*n2));
        }
else if (select==4){
            System.out.println("Bölüm=  "+(n1/n2));
        }
System.out.println("İşlem Tamamlanmıştır.");
    }

}