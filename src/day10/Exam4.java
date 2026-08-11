package day10;

public class Exam4 {
    public static void main(String[] args) {
        Car myCar = new Car(); // 1. 객체생성 , mycar.tire = null  
        myCar.tire = new Tire(); // 2. tire ->Tire

        myCar.run(); // 3. myCar.run(); -> run() -> this.tire.roll(); 
                     // 현재 tire -> new Tire()
                     // 실행 : Tire.roll(); -> 출력 : [일반] 타이어가 회전

        myCar.tire = new HankookTire(); // 4. myCar.tire -> HankookTire
                                        // Tire trie 인데 가능한 이유: 업캐스팅
        myCar.run();                    // 5. 
        myCar.tire = new KumhoTire();
        myCar.run(); 
        System.out.println( myCar.tire instanceof Tire ); // true
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false
      
    }
    
}

class Car{ // 자동차  
 Tire tire;    // <<중요>> 자동차는 Tire 타입의 타이어를 하나 가지고 있다. 
               // -> 따라서 Tire의 자식도 저장 가능하다.

 void run() { this.tire.roll(); } // 자동차가 달린다 -> 현재 장착된 타이어의 roll 실행
}

class Tire{ // 타이어
 void roll(){
 System.out.println("[일반] 타이어가 회전");
 }
}

class HankookTire extends Tire{ // 한국타이어 Tire를 상속
 void roll(){  // 메소드를 다시 만들었다 -> 오버라이딩
    System.out.println("[한국] 타이어가 회전(업그레이드)");
 }
}

class KumhoTire extends Tire{  // 금호타이어 Tire를 상속
 void roll(){ // 메소드를 다시 만들었다 -> 오버라이딩
    System.out.println("[금호] 타이어가 회전(업그레이드)");
 }
}