package PatternUsingRecursion;

import java.util.Scanner;

public class HollowHalfDiamondStar {
          // 5
          // *
          // **
          // * *
          // *  *
          // *   *
          // *  *
          // * *
          // **
          // *
          public static void row(int n,int i){
                    if(i<=n){
                              col(n,i,1);
                              System.out.println();
                              row(n, ++i);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=i){
                              if(i==1||i==j||j==1){
                                        System.out.print("*");
                              }
                              else{
                                        System.out.print(" ");
                              }
                              col(n, i, ++j);
                    }
                    
          }
          public static void row2(int n,int i){
                    if(i<=n){
                              col2(n,i,1);
                              System.out.println();
                              row2(n, ++i);
                    }
          }
          public static void col2(int n,int i,int j){
                    if(j<=n-i){
                              if(j==1||i+j==n){
                                        System.out.print("*");
                              }
                              else{
                                        System.out.print(" ");
                              }
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
