import java.util.Scanner;
public class SizeOfDT {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
   int a = 5, b = 10;
        int user = n;
        switch(user) {
            case 1 : 
               System.out.println(Math.PI*a*a) ;
               break;
            case 2:
                System.out.println(a*b);
                break;
      default:
        System.out.print("Wrong Entry");
        break;

    }
  }
}
