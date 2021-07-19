import java.util.Scanner; 
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số Fibonacci: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i) + " ");
            scanner.close();
        }
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}