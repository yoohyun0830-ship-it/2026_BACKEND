/*
    .java 파일 만들기
        1. src 폴더내 오른쪽 클릭
        2. [new java file] -> [class]
        3. 첫글자가 대문자 영문으로 시작하는 클래스명 임의 
        자바 주석 ==  자바스크립트 주석 동일
*/


package day01;   // 패키지(폴더명) 이면서 클래스의 위치 식별 용도

public class Exam1 {
    // public : 공개용 , 다른 패키지에서 사용 가능한 클래스 뜻
    // class : 클래스를 선언 사용하는 키워드
    // Exam : 클래스명은 아무거나, 단 첫글자는 '대문자'
        // * 클래스란? 자바에서의 가장 최소 컴파일/번역/통역사 단위
    // { 클래스의 시작 뜻 , } 클래스 끝 뜻
    // [x] system.out{'aaaa'} * 클래스 {} 안에서만 코드를 작성하자.


    // ** { 클래스 안/main 함수 밖 } 선언/만들기 가능하다 / 실행문 불가능 **
    // System.out.println("안녕자바"); // 오류 발생
    int a = 10;


    // [1] 자바 실행 시작점 생성 , main 함수( 번역한 코드를 읽어드리는 흐름단위 = 메인스레드 )
    // m + 엔터 : main{ } 자동완성 
    // JS에 없는 이유? 브라우저(크롬,엣지) 엔진이 해주기 때문

    public static void main(String[] args) { // main{ } start
        // ** {main 함수 안} 선언/만들기 , 실행문 가능 **
        int b = 10; // 가능 !
        // [2] 콘솔 출력문 실행하기
        System.out.println(b);
        // so + 엔터
        // CTRL + f5
        System.out.println("안녕자바"); // JS의 console.log() 와 동일
        // [3] ;(세미콜론) : 코드의 한문장이 끝났다는 뜻, 해당 기준으로 컴파일 한다.
    } // main { } end 

} // class end

// ** class 밖에서는 코드를 작성하지 말것 **





