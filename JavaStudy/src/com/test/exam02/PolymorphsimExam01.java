package com.test.exam02;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 걷습니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다");
    }
}

public class PolymorphsimExam01 {
    public static void main(String[] args) {
        PolymorphsimExam01 animalTest = new PolymorphsimExam01();
        // 여기서 메로리에 로딩되어 실행
        // 인자로 클래스를 전달하기 위해서 메모리에 클래스를 생성하기 위해서  
        // new 지시어와 생성자를 사용한다
        animalTest.moveAnimal(new Human());
        animalTest.moveAnimal(new Tiger());
        animalTest.moveAnimal(new Eagle());
    }
    public void moveAnimal(Animal animal){ //메소드의 틀만 만들어져 있는 것임.
        animal.move();
    }
}
