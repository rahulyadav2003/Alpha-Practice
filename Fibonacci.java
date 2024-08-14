public class Fibonacci {

    public static void Fib( int n ){

        int num1 = 0, num2 = 1;
        for(int i=0; i<=n; i++){

            int num3 = num1 + num2;

            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {

        Fib(7);
        
    }
    
}
