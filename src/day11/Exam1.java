package day11;
/*
    기본타입(리터럴) : byte , short , int , long , float , double , char , boolean
    참조타입(객체) : [ ]배열 , 인스턴스( String , Dto ,  Scanner 등등) , 인터페이스
*/
// 1. 인터페이스 만들기 , interface 인터페이스명
// 2. 인터페이스 주요멤버 : 상수(public static final) , 추상메소드
// 3. 추상메소드 구현할 클래스 필요<구현객체>

class ExamClass implements ExamInterface{ // 해당 클래스가 지정한 인터페이스 구현
    // * 상속은 오버라이딩(선택) vs 구현은 오버라이딩(필수)
    // 추상메소드에 대한 구현을 모두 마치면 클래스에 오류 사라진다.
    @Override public void method1( int x ){System.out.println(x);}
    @Override public int method2( int x , int y){return x + y ; }
}

public class Exam1 {
    public static void main(String[] args) {
        // [1] 인터페이스로 인스턴스 생성 불가능
        // ExamInterface ei = new ExamInterface -> 생성자가 없기 때문에

        // [2] impliments 구현한 객체
        ExamClass ec = new ExamClass();

        // [3] 다형성 : 업캐스팅
        ExamInterface ei = new ExamClass();
        // 인터페이스 타입 이더라도 오버라이딩 우선
        ei.method1(10);
        ei.method2(10, 20);
    }
}
