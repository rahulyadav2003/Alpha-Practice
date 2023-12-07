import java.util.Scanner;
public class Conditional {
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if(a>b && a>c){
        //     System.out.print("a is largest");
        // }
        // else if (b>c){
        //     System.out.println("b is largest");
        // }
        // else {
        //     System.out.print("C is largest");
        // }
        // sc.close();
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // System.out.print("Enter operator : ");
        // char operator = sc.next().charAt(0);
        // String type = (marks>=33) ? "Pass" : "Fail";
        // System.out.print(type);
        // switch (operator){
        //     case '+': System.out.print(a+b);
        //     break;
        //     case '-': System.out.print(a-b);
        //     break;
        //     case '*': System.out.print(a*b);
        //     break;
        //     case '/': System.out.print(a/b);
        //     break;
        //     case '%': System.out.print(a%b);
        //     break;
        //     default: System.out.print("INVALID OPERATION");
        // }

        // leap Year cases 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input the year: ");
        // int year = sc.nextInt();
        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z = ((year % 100 == 0) && (year % 400 == 0));
        // if (x && (y || z)) {
        // System.out.println(year + " is a leap year");
        // } else {
        // System.out.println(year + " is not a leap year");
        // }
        // sc.close();
        // Prime Number
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=2; i<Math.sqrt(n); i++){
           if  (n%i == 0){
            count++;
           }
        }
        if (count == 0){
            System.out.println(n +" Is prime");
        }
        else {
            System.out.println(n + " is not prime");
        }
        sc.close();
    }
}
