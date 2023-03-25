package PatternUsingRecursion;

import java.util.Scanner;

public class MirroredRhombusStar {
          // 5
          // *****
          //  *****
          //   *****
          //    *****
          //     *****
          public static void row(int n,int i){
                    if(i<=n){
                              space(n,i,1);
                              col(n,i,1);
                              System.out.println();
                              row(n, ++i);
                    }
          }
          public static void space(int n,int i,int j){
                    if(i>=2&&j<i){
                              System.out.print(" ");
                              space(n, i, ++j);
                    }
          }
          public static void col(int n,int i,int j){
                    if(j<=n){
                              System.out.print("*");
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
