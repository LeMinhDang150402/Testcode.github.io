import java.util.Scanner; 
public class ChuyenSo {
  public static void doiCoSo(int n,int base){ 
    if(n>=base) doiCoSo(n / base, base);
    if(n % base>9) System.out.printf("%c",n%base+55); 
    else
    System.out.print((n % base));
  }
    public static int nhap(){
              Scanner input= new Scanner(System.in); 
              boolean check= false;
              int n=0; 
              while(!check){
                     System.out.print(" "); 
                     try{
                            n= input.nextInt(); 
                            check= true;

                     }catch(Exception e){
                            System.out.println("Bạn phải nhập số: "); 
                            input.nextLine();
                     }
              }
              return (n);
      }
  public static void main(String[] args) { 
         System.out.println("Nhập vào số cần chuyển");
            int n= nhap();
            System.out.println("Nhập vào cơ số muốn chuyển"); 
            int b= nhap();
            System.out.println("Số " +n+ " chuyển sang cơ số " +b+ " thành: "); 
            doiCoSo(n,b);
  }
}