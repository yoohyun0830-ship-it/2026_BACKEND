package day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import 종합예제.model.dto.BoardDto;

public class Exam1 {
    public static void main(String[] args) {
        // 라이브러리 : 다른 사람들이 만든 클래스 / 메소드 집합
        // [1] object 클래스 : 자바의 최상위 클래스  *다형성*
        Object o1 = 3;      Object o2 = 3.14;       Object o3 = "유재석";
        Object o4 = true;   Object o5 = new int[3];
        // * 모든 자료들은 Object 타입 변수에 대입 가능 *

        // 1. toString( ) : 객체의 주소값 반환 함수 , 즉 생략 가능
        System.out.println( o5.toString() ); // [I@372f7a8d
        System.out.println( o5 );            // [I@372f7a8d
        Object o6 = new BoardDto();          // toString에 대한 오버라이딩 했음
        System.out.println( o6.toString() ); // BoardDTO [no=0, content=null , write=null]
        System.out.println( o6 );            // BoardDTO [no=0, content=null , write=null]

        // 2. equals( ) : 객체가 참조하는 값 비교 함수 , 활용처 : 객체비교 , *문자열*비교
        Object o7 = new BoardDto();
        System.out.println( o6 == o7 ); // false
        System.out.println( o6.equals(o7) ); // false
        String str1 = "유재석";     String str2 = new String("유재석");
        System.out.println( str1 == str2 ); // false
        System.out.println( str1 == "유재석" ); // true    , 리터럴문저열 == 리터럴문자열
        System.out.println( str2 == "유재석" ); // false   , 객체(리터럴문자열) == 리터럴문자열
        System.out.println( str2.equals("유재석")); // true

        // 3. hashCode( ) : 객체를 식별하는 값을 정수로 반환 함수 *주소값은 16(0~9bcdef)진수 *사람은10(0~9)진수
        // 활용처 : 객체 텀지하는 경우에 주소값이 아닌 정수로된 값(키) 비교하여 속도 향상
        System.out.println( o6.hashCode()); // 38125935
        System.out.println( o7.hashCode()); // 2129789493
        System.out.println(str1.hashCode()); // 50621969
        System.out.println("유재석".hashCode()); // 50621969

        // [2] Class : 클래스의 정보 ( 멤버변수 / 메소드 / 생성자 ) 담는 클래스
        // 1. getClass()
        String obj1 = new String();     Class c1 = obj1.getClass();
        System.out.println( c1 );       // Class java.lang.String // 패키지명과 클래스명 확인

        // 2. Class.forName( "패키지명.클래스명") , *일반예외 필수*
        // ** 리플렉션 ** : 
        // 최초실행(컴파일) 할 때 클래스의 객체 로드/생성 하지 않고 실행 도중에 객체 로드/생성 한다
        // 활용처 : JDBC(프로그램 시작이 아닌 DB연동시 MYSQL 괸련 클래스로드 ) , 스피링프레임워크( IOC )
        try{Class.forName("java.lang.String");}
        catch(ClassNotFoundException e){System.out.println( e );}

        // 3. .getFilds() : 클래스내 멤버변수 정보 반환
        Field[ ] fields = c1.getFields();
        for(Field field : fields){System.out.println(field);}

        // 4. .getConstructors() : 클래스내 생성자 정보 반환
        Constructor[] constructors = c1.getConstructors();
        for( Constructor constructor : constructors ){System.out.println(constructor);}

        // 5. .getMethods() : 클래스내 메소드 정보 반환
        Method[] methods = c1.getMethods();
        for( Method method : methods ){System.out.println(method);}
    }
}

/*
    기본타입 : byte short int long float double shar boolean
        - 리터럴 = 상수
    참조타입 : 클래스( String , Scanner , ~DTO 등등 ) , 인터페이스(Continue 등등) , 배열[ ]
        - 참조 = 주소 ,  기본타입 여러개를 하나로 만들때 사용
*/