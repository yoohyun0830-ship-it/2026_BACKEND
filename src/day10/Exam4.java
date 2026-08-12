package day10;

public class Exam4 {
    public static void main(String[] args) {
        Car myCar = new Car();          // 1. 객체생성 , mycar.tire = null  
        System.out.println(myCar);      // day10.Car@2f92e0f4

        Car yourCar = new Car();        // 동일한 클래스로 서로 다른 인스턴스 생성
        System.out.println(yourCar);    // day10.Car@28a418fc

        myCar.tire = new Tire();        //  myCar에 tire 대입
        myCar.run();                    // 현재 tire -> new Tire()
                                        // 실행 : Tire.roll(); -> 출력 : [일반] 타이어가 회전

        myCar.tire = new HankookTire(); // myCar에 새로운 tire를 대입했다 -> HankookTire
                                        // Tire trie 인데 가능한 이유: 업캐스팅
        myCar.run();                    // [한국] 타이어가 회전(업그레이드)   

        myCar.tire = new KumhoTire();   // 변수는 하나의 자료(값/인스턴스) 밖에 대입을 못한다
        myCar.run();                    // [금호] 타이어가 회전(업그레이드)

        System.out.println( myCar.tire instanceof Tire );        // 금호TIRE --> 일반TIRE true
        System.out.println( myCar.tire instanceof KumhoTire );   // 금호TIRE --> 일반TIRE true
        System.out.println( myCar.tire instanceof HankookTire ); // 금호TIRE --> 일반TIRE false

        // 즉, 인스턴스 1개당 멤버변수( tire ) 각각 생성 => 상태 ex) 아이디/비번 회원마다 제공
        // 즉, 인스턴스 여러개는 하나의 메소드( run() ) 공유 => 행위 ex) 로그인기능은 회원마다 제공할 필요X
        // 상속의 다형성? 타입변환은 호환성
    }
    
}

class Car{          // 클래스는 인스턴스르 만들기 위한 설계도
 Tire tire;         // 멤버변수 , 초기값이 없다
 void run() { this.tire.roll(); } // 메소드 , this(해당 메소드 호출한 인스턴스뜻)
}
class Tire{ 
 void roll(){       // 메소드
 System.out.println("[일반] 타이어가 회전");
 }
}

class HankookTire extends Tire{ // extends 상속/확장 , Tire를 상속
 void roll(){  // 메소드를 다시 만들었다 -> 오버라이딩 : 
    System.out.println("[한국] 타이어가 회전(업그레이드)");
 }
}

class KumhoTire extends Tire{  // 금호타이어 Tire를 상속
 void roll(){ // 메소드를 다시 만들었다 -> 오버라이딩
    System.out.println("[금호] 타이어가 회전(업그레이드)");
 }
}