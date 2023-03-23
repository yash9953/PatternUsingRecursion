package PatternUsingRecursion;

import java.util.Scanner;

public class HollowInvertedRightTriangle {
          // 5
          // *****     
          // *  *
          // * *
          // **
          // *
          public static void row(int n,int i){
                    if(i<=n){
                              col(n,i,1);
                              System.out.println();
                              row(n, i+1);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=n-i+1){
                              if(i+j>n||i==1||j==1){
                                    System.out.print("*");    
                              }
                              else{
                                        System.out.print(" ");
                              }
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
