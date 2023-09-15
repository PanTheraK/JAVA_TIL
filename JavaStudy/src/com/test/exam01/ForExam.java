package com.test.exam01;

public class ForExam {
    public static void main(String[] args) {
        int a = 3;
        if (a > 5) {

            System.out.println("5보다 크네요...");
        } else if (a > 3) {
            System.out.println("3보다 작네요..");
        } else if (a > 2) {
            System.out.println("2보다 작네요..");
        }

        int b;
        b = a == 3 ? 5 : 6;
        System.out.println("b의 값은" + b + "입니다.");

        switch (a) {
            case 3:
                System.out.println("3입니다.");
                break;// 블럭에서 빠져 나와라
            case 5:
                System.out.println("4입니다.");
                break;
            default:
                System.out.println("무슨 값인지 모르겠습니다.");
        }

        //////////////// 반복문 예제 ////////////////////

        int i = 0;
        int sum = 0;

        for (i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("For문을 이용하여 1부터 100까지 합 구하기 #1 = " + sum);
        i = 0;
        sum = 0;
        for (i = 0; i <= 100; sum += i++)
            ;
        System.out.println("For문을 이용하여 1부터 100까지 합 구하기 #2 = " + sum);

        // while(조건){ };
        i = 0;
        sum = 0;
        while (true) {
            sum += i++;
            if (i > 100)
                break;
        }
        System.out.println("while문을 이용하여 1부터 100까지 합 구하기 #1 = " + sum);

        i = 0;
        sum = 0;
        while (true) {
            sum += i++;
            if (i <= 100)
                continue;
            else
                break;
        }
        System.out.println("while문을 이용하여 1부터 100까지 합 구하기 #2 = " + sum);
        //do-while문: do( ) whole(조건)
    i = 0;
    sum = 0;
    do{
        sum += i++;
    }
    while(i<=100);
        System.out.println("do-while문을 이용하여 1부터 100까지 합 구하기 #1 = " + sum);
    
    }

}
