package com.test.exam02;

public class PolymorphsimExam02 {
    public static void main(String[] args) {
        new AnimalMove(new Human1());
        new AnimalMove(new Tiger1());
        new AnimalMove(new Eagle1());
    }
}

//★★★ 스프링 배울때 의존성 주입의 기본 작동 원리
class AnimalMove{
    Animal1 animal; // 멤버변수
    public AnimalMove(Animal1 animal){
        this.animal = animal;
        animal.move();

    }
}

interface Animal1 {
    public void move();
}

class Human1 implements Animal1 {
    @Override
    public void move() {
        System.out.println("사랑이 두발로 걷습니다");
    }
}

class Tiger1 implements Animal1 {
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 걷습니다");
    }
}

class Eagle1 implements Animal1 {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다");
    }
}
