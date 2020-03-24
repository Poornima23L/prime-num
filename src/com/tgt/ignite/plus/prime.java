package com.tgt.ignite.plus;

import java.util.Scanner;

    public class prime {
        public static void main(String[] args){
            int m=0,i,flag=0,j,n;
            Scanner read = new Scanner(System.in);
            System.out.println("enter 1st num");
            m = read.nextInt();
            System.out.println("enter 2nd num");
            n = read.nextInt();
            for(i=m;i<=n;i++) {
                if (i == 0 || i == 1) {
                    continue;
                }
                else {

                    for (j = 2; j < i / 2; ++j) {
                        if (i % j == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(i);
                    }
                }
            }

        }
    }


