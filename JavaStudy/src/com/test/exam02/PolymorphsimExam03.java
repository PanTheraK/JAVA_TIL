package com.test.exam02;

public class PolymorphsimExam03 {// 업캐스팅
    // 어떤 클래스 내에 많은 메소드가 있고 이 클래스를 인스턴스화 시켜서 메모리로 로딩 시키면
    // 많은 메모리가 소비됨, // 이 클래스 내에 일부 메소드만 사용한다고 할 때
    // 엄청난 메모리의 낭비가 유발
    // 그래서 이런 메모리의 낭비를 없애는 방법으로 업캐스팅 기법을 사용
    // 업캐스팅 방법을 사용하게 되면 필요한 메소드만 메모리에 가져옴
    public static void main(String[] args) {
        Family f;
        f = new KimFamily();
        f.hello();

        f = new ParkFamily();
        f.hello();

        f = new ChoiFamily();
        f.hello();

        String str = "1234";
        System.out.println(Integer.parseInt(str));

        int sum = 1234 + Integer.parseInt(str);
        System.out.println("sum= " + sum);

    }
}

class Family {
    void hello() {
        System.out.println("가족들과 인사합시다");
    }
}

class KimFamily extends Family {
    @Override
    void hello() {
        System.out.println("김선생님 안녕하세요 ?");
    }

    void dinner() {
        System.out.println("같이 식사나 한번 하시죠");
    }

    void drink() {
        System.out.println("술 한잔 하시죠");
    }
}

class ParkFamily extends Family {
    void hello() {
        System.out.println("박선생님 안녕하세요?");
    }

    void fishing() {
        System.out.println("낚시한번 하시죠");
    }
}

class ChoiFamily extends Family {
    void hello() {
        System.out.println("최선생님 안녕하세요?");
    }
}