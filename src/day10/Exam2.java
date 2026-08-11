package day10;

public class Exam2 {
    public static void main(String[] args) {

        // JAVA는 100% 객체지향언어이다.
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계
        // 1. A --> Object
        A a = new A(); // 총 2개 , A --> Object
        // 2.
        B b = new B(); // 총 3개 , B --> A --> Object
        // 3.
        C c = new C(); // 총 3개 , C --> A --> Object
        // 4.
        D d = new D(); // 총 4개 , D --> B --> A --> Object
        // 5. 
        E e = new E(); // 총 4개 , E --> C --> A --> Object

        // [2] 자동타입변환 / 업캐스팅
        A a2 = b; // B --> A [가능]
        Object o1 = a2; // A --> Object [가능]

        // [3] 강제타입변환 / 다운케스팅
        B b2 = (B)a2; // A --> B [가능] 태생이 B 이기 때문
        // C c2 = (C)b; / 즉, 형제 타입변환 안됨. B는 C를 포함하지 않기 때문
        
        // [4] 타입확인 , 인스턴스 istanceOf 타입명
        System.out.println(e instanceof Object); // e --> Object // true
        System.out.println(e instanceof C); // e --> C // true
        // System.out.println(e instanceof D); // e --> D // false
        // System.out.println(e instanceof B); // e --> B // false
        // 즉 , 타입변환 전애 instanceOf 키워드 타입 확인 후 타입변환<안전>
    }
}

class A {
    A(){System.out.println("[1]A객체생성");}
}
class B extends A{
    B(){System.out.println("[2]B객체생성");}
}
class C extends A{
    C(){System.out.println("[3]C객체생성");}
}
class D extends B{
    D(){System.out.println("[4]D객체생성");}
}
class E extends C{
    E(){System.out.println("[5]E객체생성");}
}
