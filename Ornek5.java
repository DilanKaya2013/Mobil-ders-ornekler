import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Mevcut maaşını giriniz: ");
            double maas = scanner.nextDouble();


            double zamOrani = 43./100;
            double yeniMaas = maas + (maas * zamOrani);


            System.out.println("Yeni maaş: "+ yeniMaas);

            scanner.close();
    }
}
