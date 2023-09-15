package com.test.exam02;

import com.test.member.Member;

public class ClassExam01 {
    // 하나의 자바 파일내에 여러개의 클래스가 있을 경우엔 파일명과 같은 클래스가 반드시 있어야 하고
    // 그 클래스에만 public을 붙일 수 있음.
    public static void main(String[] args) {
        /*
         * Sum sum1 = new Sum(); //클래스 참조형 변수 선언 및 정의 --> 인스턴스 화(Instance)
         * System.out.println(sum1);
         * System.out.println(sum1.getSumA());
         * System.out.println(sum1.getSumB());
         * sum1.sumA = 3;
         * sum1.sumB = 4;
         * System.out.println(sum1.getSumA());
         * System.out.println(sum1.getSumB());
         * 
         * Sum sum2 = new Sum();
         * System.out.println(sum2);
         * System.out.println(sum1==sum2);
         * 
         * sum2.sumA = 13;
         * sum2.sumB = 15;
         */

        Sum sum = new Sum();
        sum.setSumA(3);
        sum.setsumB(4);
        System.out.println("Sum 클래스의 멤버변수 sumA = " + sum.getSumA());
        System.out.println("Sum 클래스의 멤버변수 sumB = " + sum.getSumB());
        System.out.println("4와5의 합은 " + sum.sum(4, 5) + "입니다.");

        Member member = new Member("김동규", "남성", 25);
        // member.setName("김동규");
        // member.setGender("남성");
        // member.setAge(25);

        System.out.println("이름: " + member.getName() + "\t"
                + "성별: " + member.getGender() + "\t"
                + "나이: " + member.getAge());

            

        new Member(); // 익명 객체 생성

        new Member("최민수");
        
    }
}

class Sum { // 객체의 속성과 액션을 코드화한 템플리트(틀)
    int sumA; // 멤버변수
    int sumB; // 멤버변수

    public int getSumA() { // 이러한 네이밍 규칙으로 private 멤버변수의 값을 가져오는 메소드를 getter 메소드라 함.
        return this.sumA; // this : 자신이 속한 클래스를 의미
    }

    public void setSumA(int sumA) {// int sumA:지역변수
        this.sumA = sumA;
    }

    public int getSumB() {
        return this.sumB;
    }

    public void setsumB(int sumB) {
        this.sumB = sumB;
    }

    int sum(int a, int b) {
        final int K = 5;
        System.out.println(K);
        return a + b;
    }
}