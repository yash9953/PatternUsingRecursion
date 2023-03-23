package PatternUsingRecursion;

import java.util.Scanner;

public class HollowInvertedPyramid {
          // 5
          // *********
          //  *     *
          //   *   *
          //    * *
          //     *
          public static void row(int n,int i){
                    if(i<=n){
                              space1(n,i,1);
                              col1(n,i,1);
                              col2(n,i,1);
                              space2(n,i,1);
                              System.out.println();
                              row(n,++i);
                    }
          } 
          public static void space1(int n,int i,int j){
                    if(i>=2&&j<=i-1){
                              System.out.print(" ");
                              space1(n, i, ++j);
                    }
          }
          public static void col1(int n,int i,int j){
                    if(j<=n-i+1){
                              if(j==1||i==1){
                                  System.out.print("*");      
                              }
                              else{
                                        System.out.print(" ");
                              }
                              col1(n, i, ++j);
                    }
          }
          public static void col2(int n,int i,int j){
                    if(j<=n-i){
                              if(i+j==n||i==1){
                                        System.out.print("*");      
                              }
                              else{
                                        System.out.print(" ");
                              }     
                              col2(n, i, ++j);
                    }
          }
          public static void space2(int n,int i,int j){
                    if(i>=2&&j<=i-1){
                              System.out.print(" ");
                              space2(n, i, ++j);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    sc.close();
          }
}
