package day15;

import java.util.HashMap;
import java.util.Map;

public class Exam1 {
    public static void main(String[] args) {
        /*
            <제네릭타입> : 클래스 만들때 타입 정의 X => 클래스 사용할 때 타입 정의 O
                List<BoardDto>list = new ArrayList<>()
                    - List 인터페이스 만들 때 정의 X => 인터페이스 사용시 BoardDto 타입 정의 O

            <컬렉션 프레임워크>
                List 인터페이스 :   중복허용 , 인덱스(순서) 있다 
                                    -> ArrayList, LinkedList, Vector
                Set 인터페이스 :    중복불가 , 인덱스(순서) 없다 
                                    -> HashSet, TreeSet
                Map 인터페이스 :    KEY중복불가 / VALUE 중복 허용 , 인덱스(순서) X 
                                    -> HashMap, TableMap, TreeMap 
        */
       // [1] Map : key 와 value 한쌍(엔트리)로 여러개 쌍(엔드리) 저장하는 구조 = JSON( { } )  
       Map< String , Integer > map = new HashMap<>();
       
       // [2]사용법(메소드)
       // (1).put( key , value ) : key/value 한쌍 엔트리 추가
       map.put("유재석",95); // KEY :"유재석" -> 95 값 저장
       map.put("강호동",100);
       map.put("신동엽",78);
       map.put("유재석",80); // 주의할점 : 기존에 존재 KEY -> VALUE 수정
       System.out.println(map);         // {유재석=80, 강호동=100, 신동엽=78}

       // (2) .get( key ) : key 해당하는 value 반환
       System.out.println(map.get("강호동")); // 100

       // (3) .size( ) : 총 엔트리 수 반환
       System.out.println(map.size()); // 3

       // (4) .containsKey( 찾을Key ) : 찾을 Key 존재하면 true / false
       //     .containsValue( 찾을Value ) : 찾을 Value 존재하면 true / false
       System.out.println(map.containsKey("강호동")); // true
       System.out.println(map.containsValue(100));  // true

       // (5) .keySet() : 모든 key 반환 , values( ) : 모든 value 반환
       System.out.println(map.keySet());    // [유재석, 강호동, 신동엽]
       System.out.println(map.values());    // [80, 100, 78]

       // (6) .remove( key ) : 해당하는 key의 엔트리(key:value) 삭제
       map.remove("강호동"); System.out.println(map);   // {유재석=80, 신동엽=78}

       // (7) .clear( ) : 모든 엔트리 삭제
       map.clear();

       // (8) .isEntry( ) : 엔트리가 존재하지 않으면 true / false
       System.out.println( map.isEmpty() );

       // * 활용처 : (1) JSON <-- --> DTO / MAP(JAVA)
       //            (2) 자료구조( 암호화 )

       // (9) 반복문 관계
       // (9-1) 일반 FOR문 불가능 , 인덱스가 없다
       // (9-2) 향상된 FOR문 , KEY
       for(String key : map.keySet()){ // 모든 KEY들을 꺼내서 반복문
            System.out.println(key + ":" + map.get(key)); // 키 이용한 값 호출
       }
       // (9-3) .forEach( (반복변수명) -> { } );
       map.keySet().forEach(( key ) -> {System.out.println(key + ":" +map.get(key));});
    }
}
