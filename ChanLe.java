import java.util.Scanner;
public class ChanLe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int n = scanner.nextInt();
        System.out.println(Check(n));
        scanner.close();
    }
    public static boolean Check(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}

