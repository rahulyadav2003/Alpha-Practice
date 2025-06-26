public class patterns {
    public static void main(String args[]){
        // char ch = 'A';
        // int num = 1;
        // for (int i=1; i<=5;i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        //  }

        //inverted star pattern

        // for (int i=5; i>=1;i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        int n =4;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
