package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {

        // [1] LIST 인터페이스
        ArrayList<String>list1 = new ArrayList<>();
        // list1 = new LinkedList() / 불가능 / 형제끼리 타입변환 불가능
        List<String>list2 = new ArrayList<>();
        list2 = new LinkedList<>(); // 다형성

        // [2] List 인터페이스 타입으로 수현체 메소드 사용가능 <day09 Exam1> , 구현체들이 오버라이딩
        list2.add("유재석");
        System.out.println(list2.get(0));
        list2.add("강호동");

        // [3] 리스트/배열 과 반복문 관계 / 리스트(목록)내 항목(값)들을 한번에 못 꺼내고 하나씩(순회/반복) 꺼낸다
        // 1. 일반 for문
        for( int index = 0 ; index <= list2.size() -1 ; index++){ // index가 0부터 마지막인덱스 까지 인덱스
            String str = list2.get(index);
        }
        // 2. 향상된 for문 : :콜론 기준으로 오른쪽에 리스트(목록)들을 하나씩 왼쪽에 대입 반복
        for(String str : list2){ }

        // 3. forEach문 , 반복메소드 , 리스츠객체.forEach( (반복변수명) -> { } );
        list2.forEach((str)->{System.out.println(str);});

        // [4] LIst 구현체 차이 : 사용법(함수/메소드) 동일 , 구조적 차이

        // ArrayList : 인덱스 기반의 배열 구조 + 동기화 미지원
        //              [A] [B] [C] [D]     => E 저장한 경우 마지막 뒤에 E 저장한다
        //               0   1   2   3      => B 삭제한 경우 삭제된 B 이후로 C D 한칸씩 앞으로 이동한다.
        //              1000개의 자료가 있다는 가정에 일부 삭제/수정 하면 999 이동발생
        //              => 즉, 삽입 빠르다.

        // LinkedList : 링크[h헤더][d본문][t꼬리] = 노드 기반의 리스트 구조
        //              [][ A ][B주소]   [A주소][B][C주소]   [B주소][C][D주소]   [C주소][D][]
        //              E 저장한 경우 마지막 D꼬리에 E주소 저장하고 E헤더에 D주소 저장한다.
        //              B 삭제한 경우 삭제할 노드에 고히에 주소를 헤더노드에 꼬리에 대입한다.
        //              [][ A ][C주소]  [A주소][C][D주소]   [C주소][D][]
        //              1000개의 자료가 있다는 가정에 일부 삭제/수정 하면 앞뒤만 이동 발생
        //              => 즉, 중간 삽입/삭제 빠르다.

        // vector : ArrayList 동일한 구조 + 동기화(스레드) 지원



    }
    
}
