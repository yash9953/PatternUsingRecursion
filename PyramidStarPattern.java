package PatternUsingRecursion;

import java.util.Scanner;

public class PyramidStarPattern {
          // 5
          //    *
          //   ***
          //  *****
          // *******
          //*********    
          public static void row(int n,int i){
                    if(i<=n){
                              space(n,i,1);
                              col(n,i,1);
                              col2(n,i,1);
                              System.out.println();
                              row(n, ++i);
                    }
          }
          public static void space(int n,int i,int j){
                    if(j<=n-i){
                              System.out.print(" ");
                              space(n, i, ++j);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=i){
                              System.out.print("*");
                              col(n, i, ++j);
                    }
          }
          public static void col2(int n,int i,int j){
                    if(j<=i-1&&i>=2){
                              System.out.print("*");
                              col2(n, i, ++j);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    sc.close();
          }
}
