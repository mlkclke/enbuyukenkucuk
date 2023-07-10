import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz:");
        int n = scanner.nextInt();

        int[] sayi = new int[n];
        System.out.println(n + "  Tane sayı giriniz:");


        for (int i = 0; i < n; i++) {
            sayi[i] = scanner.nextInt();
        }
        int enKucuk = sayi[0];
        int enBuyuk = sayi[0];

        for (int i = 1; i < n; i++) {
            if (sayi[i] < enKucuk) {
                enKucuk = sayi[i];
            }

            if (sayi[i] > enBuyuk) {
                enBuyuk = sayi[i];
            }
        }
        System.out.println("En büyük sayı :" + enBuyuk);
        System.out.println("En küçük sayı :" + enKucuk);


        scanner.close();
    }
}