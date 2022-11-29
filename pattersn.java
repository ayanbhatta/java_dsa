public class patterns{
    public static void main(String[] args){
          //patterns_1
        //   int n =4;
        //   for(int i=0; i<=n; i++){
        //     for (int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //   System.out.println();
        //   }

        //pattern_2
        // int n=4;
        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<=n-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

       // pattern_3
    //    int n=4;
    //    for(int i=0; i<=n; i++){
    //     for(int j=0; j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=0; j<=i;j++){
    //         System.out.print("*");
    //     }
    //    System.out.println();
    //    }


    //pattern_4
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


    //pattern_5
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    //pattern_6
        // int n=5;
        // int num=1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        //pattern_7
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }



        //pattern_8
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        //pattern_9
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for (int j=1;j<=n;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        //pattern_10
        
        //  int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


       // pattern_11
        int n=4;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }



    }
}