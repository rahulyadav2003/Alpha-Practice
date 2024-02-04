import java.util.*;
// //Firsst Function/Methods

class Methods{

    public static void demo(){
        System.out.println("Hello World");
        return;
    }

    public static int add(int a, int b){ // A and B are parameters or formal parameter
        int sum = a+b;
        return sum;
    }

    public static void swap (int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp; 
        
    System.out.println("Swap Value A : " + a);
    System.out.println("Swap Value B : " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        swap(a,b);
        //System.out.print("Sum = " + add(a,b));  
        sc.close();
    }
}