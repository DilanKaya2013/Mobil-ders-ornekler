import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci Kenarı (a) girin:");
        double a=scanner.nextDouble();

        System.out.println("Birinci Kenarı (b) girin:");
        double b=scanner.nextDouble();

        double c=Math.sqrt(a*a+b*b);
        System.out.println("(c):"+c);
        scanner.close();
    }
}
