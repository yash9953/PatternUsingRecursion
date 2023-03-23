package PatternUsingRecursion;

import java.util.Scanner;

public class HollowRhombusStarPattern {
          // 5
          //     *****
          //    *   *
          //   *   *
          //  *   *
          // *****
          public static void row(int n,int i){
                    if(i<=n){
                              space(n,i,1);
                              col(n,i,1);
                              System.out.println();
                              row(n, ++i);
                    }
          }
          public static void space(int n,int i,int j){
                    if(j<=n-i){
                              System.out.print(" ");
                              space(n, i,++j);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=n){
                              if(i==1||i==n||j==1||j==n){
                                        System.out.print("*");
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
