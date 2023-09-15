package com.test.exam01;

public class Pyramid {
    public static void main(String[] args) {
        int num = 10;
         for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
                System.out.println("");

        }
        // 반복문 돌때마다 띄어쓰기 다돌아가면 별표찍기 그다음 줄바꿈 
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <(num-1)-i; j++)
                System.out.print(" ");
            for(int k =0; k<= i; k++)
            System.out.print("*");
            System.out.println("");
        }
        

        for(int i=0;i<num; i++){
            for(int j=1; j<num-i; j++)
            System.out.print(" ");
            for(int k=0; k<i*2+1;k++)
            System.out.print("*");
            System.out.println();
        }
        for (int i= num-1; i>0; i--){
            for(int j=num -i; j>0; j--)
            System.out.print(" ");
            for(int k= i*2-1; k>0; k--)
            System.out.print("*");
            System.out.println();
        }
    }
}
