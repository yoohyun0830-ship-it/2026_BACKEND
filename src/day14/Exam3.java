package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {
        
        // SET 인터페이스 : 여러개 자료들을 저장하는 컬렉션 , 중복허용안함(자료값으로 식별) , 인덱스(순서X)
        // 1. SET 구현
        Set < String > set1 = new HashSet<>();

        // 2. Set   .add( 추가할 값 );
        set1.add("유재석"); set1.add("강호동");
        set1.add("유재석"); // List 중복 허용 O , Set 중복 허용 X
        set1.add(new String("유재석")); // 중복방지
        System.out.println( set1 ); // [유재석, 강호동]

        // 3. .get(인덱스); 지원불가 -> 인덱스가 없기 때문
        // set1.get(0);

        // 4. .size( ); : 항목 개수 반환
        System.out.println(set1.size());

        // 5. .remove(자료); 인덱스가 아닌 자료 삭제
        set1.remove("강호동");

        // 6. .indexOf( 찾을값 ); 지원불가 , contains( 찾을값 ) 지원
        set1.contains("강호동"); // false

        // 7. .clear() : 항목 전체삭제
        set1.clear();

        // 8. .isEmpty() : 항목에 하나도 없으면 true/false
        set1.isEmpty();

        // 9. set 컬렉션과 반복문의 관계
        // 9-1. 일반 for문 , 불가능( 인덱스가 없으니까 )
        // 9-2. 향상된 for문, 지원
        for(String str : set1){System.out.println(str);}
        // 9-3. forEach, 지원 컬렉션객페.forEach( (반복변수명) -> { } )
        set1.forEach((str)->{System.out.println(str);});
        // - 활용처 : Set( JDBC ResultSet )

        /* Iterator<String> 순회자 set1.iterator(); // 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
        while( 순회자.hasNext()){                // 인터페이스 이용한 다음 자료 확인
            System.out.println(순회자.next());   // 다음 자료 꺼내기 지원
        }
        // 즉, 위 코드 이용한 향상된 for문 / forEach / ResultSet 만들어짐 */

        // 10. TreeSet 이용한 자동 정렬 지원
        TreeSet< Integer > set2 = new TreeSet<>();
        set2.add(50); set2.add(70); set2.add(60);
        System.out.println(set2);                       // [50, 60, 70] : 기본값이 오름차순

        // descendingIterator 메소드는 set 인터페이스내 추상메소드 없다.
        System.out.println(set2.descendingIterator());  // [70, 60, 50] : 내림차순

    }
    
}
