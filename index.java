import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        System.out.println("Wie lange soll das array sein?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        sc.close();
        
    }
}