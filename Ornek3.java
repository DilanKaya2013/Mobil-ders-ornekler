import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

        int yazili1 ,yazili2 ,ortalama;
        Scanner oku=new Scanner(System.in);
        System.out.println("Yazili1 gir: ");
        yazili1=oku.nextInt();

        System.out.println("Yazili2 gir: ");
        yazili2=oku.nextInt();

        ortalama=(yazili1+yazili2)/2;
        System.out.println("Ortalama:"+ortalama);


    }
}
