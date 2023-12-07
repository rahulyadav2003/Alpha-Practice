import java.util.Scanner;
public class Loops {
    public static void main (String agrs[]){
    //     Scanner sc = new Scanner(System.in);
    //     int range = sc.nextInt();
    //     int n=1;
    //     int sum = 0;
    //     while( n<=range ){
    //         sum += n;
    //         n++;
    //     }
    //     System.out.println("Sum is : " +sum);
    //     sc.close();
    // int n = 1;
    // while ( n<=4){
    //      System.out.println("* * * *");
    //      n++;
    // }

    //reversing an number
    // int rev_num = 0;
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // while (n!=0){
    //     int num = n%10;
    //     n = n/10;
    //     rev_num = (rev_num*10)+num;
    //     sc.close();
    // }
    // System.out.println(rev_num);
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for (int i=n-1; i>0; i--){
    //     n = n*i;
    //     sc.close();
    // }
    // System.out.println(n);
    System.out.println("Enter the number");
    Scanner sc = new Scanner (System.in);
    int  num, choice; 
    int evensum = 0;
    int oddsum = 0;

    do{
        System.out.println("Enter the number");
        num = sc.nextInt();
        if (num%2 == 0){
        evensum +=num;
        }
        else{
            oddsum +=num;
        } 

        System.out.print("Do you want to continue? Press 1 for yes or other for no : ");
        choice = sc.nextInt();
  
    }while(choice == 1);

     System.out.println(evensum);
     System.out.println(oddsum);
     sc.close();
    }
}
