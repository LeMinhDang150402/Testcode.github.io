import java.util.Scanner; 
public class NguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số ");
        int n = scanner.nextInt();
        if(isPrimeNumber(n) == true) {
            System.out.println("Đây là số nguyên tố");
        }
        else{
            System.out.println("Đây không là số nguyên tố");
        }
        scanner.close();
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
