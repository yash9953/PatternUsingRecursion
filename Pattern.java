package PatternUsingRecursion;

import java.util.Scanner;

public class Pattern {
          // n=3
          // 3 3 3 2 2 2 1 1 1
          // 3 3 2 2 1 1
          // 3 2 1
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int copy=n;
                    for(int i=n;i>=1;i--){
                              for(int j=n;j>=1;j--){
                                        int count=copy;
                                        while(true){
                                                  System.out.print(j+" ");
                                                  count--;
                                                  if(count==0){
                                                            break;
                                                  }
                                        }
                              }copy-=1;
                              System.out.println();
                    }
                    sc.close();
          }
}
