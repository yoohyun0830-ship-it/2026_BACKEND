package day08;

public class Exam2 {
    public static void main(String[] args) { 
        // [1] 
        User u1 = new User();
        // u1.name = "유재석"; // 접근 불가
        u1.setName("유재석");
        // System.out.println(u1.name);
        System.out.println(u1.getName());

        // [2] 객체를 출력하면 객체 주소값 반환
        System.out.println( u1 ); 
        // toString메소드가 존재하는 갹체는 주소값 대신에
    }
    
}

class User{ // 클래스란? 객체 설계시 설계도/종이
        // 1. 멤버 변수 = 상태 = private 사용
        private String name;
        private int age;

        // 2. 생성자 = 초기화
        // 3. 메소드 = 행위
        // - private 메소드에 대한 간접접근 메소드
        // setter , getter , set 멤버변수 , get 멤버변수
        // getter 존재하면 V(value)O(object) 읽기모드
        // setter/getter 존재하면 D(data)T(transfer)O(object) 읽기/쓰기
        public  void setName(String nmae) {
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        
         }   
        public int getAge() {return age;}
        public  void setAge(int age) { this.age=age;}

        // 3. toString : 객체호출시 주소값 대신에 문자열 반환
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }

        // DTO) : 데이터베이스에 있는 자료 -> 이동 DTO -> 프론트엔드
        //        1. 관례적으로 멤버변수 모두 private
        //        2. setter/getter 제공
        //        3. toString 제공
        //        4. 생성자에 기본생성자 1개, 전체매개변수 1개 => 2개
        // MVC패턴 : 소규모가 아닌 체계적인(약속) 규모 필요할 때 클래스 역할 나누기
        /* V : VIEW 입출력 담당                 HTML/CSS/REACT/FLUTTER
           C : Controller 제어(백/프) 중계      JAVA/PHTHON/NODE.JS
           M : Model 데이터 담당                DTO,VO (CONTROLLER-외부DB/클라우드)
           1인 식당 운영 : 사장이 서빙 - 요리 - 재료관리
           N인 식당 운영 : 서빙담당자 - 요리담당자 - 재료담당자
         */
        

}