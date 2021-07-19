import java.util.Scanner; 
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String wort = scanner.nextLine();
        char[] warray = wort.toCharArray(); 
        System.out.println(CheckPalindrom(warray)); 
        scanner.close();      
    }
 
    public static boolean CheckPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;    
    }
}
