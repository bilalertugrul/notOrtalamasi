import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Not Ortalaması Hesaplayan Program
          Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
          Ödev
          Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

          Not : If ve Else kullanılmayacak... */

        int mat, fizik, kimya, turkce, tarih, muzik, sum;


        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunu Giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik = input.nextInt();

        sum = ((mat+fizik+kimya+turkce+tarih+muzik)/6);

        boolean kosul1 = sum>=60;

        String sonuc = (kosul1) ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println("ortalamaniz : " + sum);
        System.out.println(sonuc);


    }
}