package day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam2 {
    public static void main(String[] args) {
        
        /* 스택 (stack) : 후입선출 ( LIFO : 가장 마지막에 삽입된 자료가 가장 먼저 삭제된다. )
            (예) 브라우저( 뒤로가기 ) , CTRL + Z( 실행취소 )
            - Stack 클래스 이용한 구현 , push 삽입 -> pop 출력
        */
        Stack<String> stack = new Stack<>();
        stack.push("네이버 메인 페이지");
        stack.push("뉴스 페이지");
        stack.push("블로그 페이지"); // 메인 -> 뉴스 -> 블로그
        while (!stack.isEmpty()) { // !:부정문 , !변수명.isEmpty() , 비어있으면 반복문 종료
            System.out.println(stack.pop());
        }

        /* 큐 (QUEUE) : 선입선출 ( FIFO : 가장 먼저 삽입된 자료가 가장 먼저 삭제된다. )
            (예) 번호(웨이팅)표 , 프린트(인쇄) 등등
            - LinkedList 클래스 이용한 구현 , offer 입력 -> poll 출력

         */
        Queue<String> queue = new LinkedList<>();
        queue.offer("1번 손님");    queue.offer("2번 손님");    queue.offer("3번 손님");
        while (!queue.isEmpty()) {
            System.out.println( queue.poll() );
        }
    }
}
