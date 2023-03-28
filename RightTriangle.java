package PatternUsingRecursion;

import java.util.Scanner;

public class RightTriangle {
          // 5
          // *
          // **
          // ***
          // ****
          // *****
          public static void row(int n,int i){
                    if(i<=n){
                              col(n,i,1);
                              System.out.println();
                              row(n, i+1);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=i){
                              System.out.print("*");
                              col(n, i, j+1);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    sc.close();
          }
}
