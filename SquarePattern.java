package PatternUsingRecursion;

import java.util.Scanner;

public class SquarePattern {
          public static int count=0;
          public static char c='A';
                    // 5
                    // *****	       12345        12345    11111   AAAAA
                    // *****         678910       12345    22222   BBBBB
                    // *****         1112131415   12345    33333   CCCCC
                    // *****         1617181920   12345    44444   DDDDD
                    // *****         2122232425   12345    55555   EEEEE

                    
          public static void row(int n,int i){
                    if(i<=n){
                              col(n,1,i);
                              // after printing one row move to next line
                              System.out.println();
                              c++;
                              row(n, i+1);
                    }
          }
          public static void col(int n,int j,int i){
                    if(j<=n){
                              // count++;
                              // System.out.print(count);
                              System.out.print(c);
                              col(n,j+1,i);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    row(n,1);
                    sc.close();
          }
}
