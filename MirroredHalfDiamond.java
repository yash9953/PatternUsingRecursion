package PatternUsingRecursion;

import java.util.Scanner;

public class MirroredHalfDiamond {
          // 5
          //     *
          //    **
          //   ***
          //  ****
          // *****
          //  ****
          //   ***
          //    **
          //     *
          public static void row(int n,int i){
                    if(i<=n){
                              space1(n,i,1);
                              col1(n,i,1);
                              System.out.println();
                              row(n,++i);
                    }
          } 
          public static void space1(int n,int i,int j){
                    if(j<=n-i){
                              System.out.print(" ");
                              space1(n, i, ++j);
                    }
          }
          public static void col1(int n,int i,int j){
                    if(j<=i){
                              System.out.print("*");
                              col1(n, i, ++j);
                    }
          }
          public static void row2(int n,int i){
                    if(i<=n){
                              space2(n,i,1);
                              col2(n,i,1);
                              System.out.println();
                              row2(n,++i);
                    }
          } 
          public static void space2(int n,int i,int j){
                    if(j<=i){
                              System.out.print(" ");
                              space2(n, i, ++j);
                    }
          }
          public static void col2(int n,int i,int j){
                    if(j<=n-i){
                              System.out.print("*");
                              col2(n, i, ++j);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    row2(n, 1);
                    sc.close();
          }
}
