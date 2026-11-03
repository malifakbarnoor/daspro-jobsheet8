import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int jumlahAngka = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(j * i + "\t");
                jumlahAngka += (j * i);
            }
            System.out.println();
        }
        System.out.print("Jumlah Angka tercetak: " + jumlahAngka);
        sc.close();
    }
}
