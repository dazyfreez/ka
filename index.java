import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        System.out.println("Wie lange soll das array sein?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        sc.close();
        System.out.println("Bitte geben Sie die Werte ein:");
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = sc2.nextInt();
            System.out.println("Der Wert " + i + " ist " + array[i]);
        }
        sc2.close();
    }
}