public class Main {


    public static void main(String[] args) {
	/* patterns
	*
	**
	***
	****
	 */

        int n = 4;
        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");

// reverse pattern
        /*
        ****
        ***
        **
        *
         */
        int m = 4;
        for(int i = m; i >= 1 ; --i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("------------------------------------------------");

// pattern
        /*
           *
          **
         ***
        ****
         */
        int o = 4;
        for(int i = 1; i <= o ; i++) {
            for(int j = 1; j <= o-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("---------------------------------------");


        // pattern with numbers
/*
1
12
123
1234
12345
 */
 int k = 5;
 for(int i=1;i<=k;i++){
     for(int j=1;j<=i;j++){
         System.out.print(j);
     }
     System.out.println();
 }
        System.out.println("------------------------------------");

//patter
/*
12345
1234
123
12
1
 */

int l = 6;
for(int i = l; i >= 1;--i){        //for(int i=1; i<=n; i++)
    for(int j=1;j<=i;j++){         //for(int j=1; j<=n-i+1; j++)
        System.out.print(j);
    }
    System.out.println();
}
        System.out.println("-------------------------------------");

// pattern Floyd's Triangle
 /*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
         */

        int p = 6;
        int number = 1;
        for(int i = 1; i <= p; i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");

        //pattern 0-1 triangle
        /*
        1
        01
        101
        0101
        10101
         */
  int x=5;
  for(int i=1; i<=x; i++){
      for(int j=1; j<=i; j++){
          int sum = i+j;
          if(sum % 2 == 0){
              System.out.print("1 ");
          }else {
              System.out.print("0 ");
          }
      }
      System.out.println();
  }
        System.out.println("----------------------------------");

        System.out.println("THE END");

    }
}
