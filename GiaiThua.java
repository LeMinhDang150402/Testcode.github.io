import java.util.Scanner;
public class GiaiThua{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số cần tìm giai thừa: ");
        int a = scanner.nextInt();
        System.out.println("Giai thừa của " + a + " là: " + GiaiThua.tinhGiaithua(a));
        scanner.close();
    }
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
}