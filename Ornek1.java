import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        int kisakenar,uzunkenar ,alan,cevre;
        Scanner  oku=new Scanner(System.in);
        System.out.println("kısakenar gir: ");
        kisakenar=oku.nextInt();

        System.out.println("uzunkenar gir: ");
        uzunkenar=oku.nextInt();

        alan=kisakenar*uzunkenar;
        System.out.println("Alan: "+alan);

        cevre=(kisakenar+uzunkenar)*2;
        System.out.println("Cevre: "+cevre);


    }
}
