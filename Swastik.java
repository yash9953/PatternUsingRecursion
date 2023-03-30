package PatternUsingRecursion;

import java.util.Scanner;

public class Swastik {
          // 11
          // *    ******
          // *    *
          // *    *
          // *    *
          // *    *
          // ***********
          //      *    *
          //      *    *
          //      *    *
          //      *    *
          // ******    *
          public static void row(int n,int i){
                    if(i<=n){
                              col(n,i,1);
                              System.out.println();
                              row(n, ++i);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=n){
                              if(((i==1||i==n)&&(i==j))||((i==1&&j==n)||(i==n&&j==1))||
                              (i==1&&j<=n-1&&j>(n/2+1))||(i==n&&j<=(n/2+1)&&j>1)||
                              (j==1&&i<(n/2+1)&&i>1)||(j==n&&i>(n/2+1)&&i<n)||i==(n/2+1)||j==(n/2+1)){
                                        System.out.print("*");
                                        // col(n, i, ++j);
                              }
                              else{
                                        System.out.print(" ");
                              }
                              col(n, i, ++j);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    sc.close();
          }
}
