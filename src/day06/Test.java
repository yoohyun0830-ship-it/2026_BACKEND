package day06;

import java.util.Scanner;

// [1] 화면에 대한 스케치
// [2] 메모리/설계
// [3] 기능설계


public class Test {
    public static void main(String[] args) {  // main 함수는 프로그램 시작점
        // [5] 배열 생성 (하나의 표 저장하기 위한)
        Post[] posts = new Post[100];
        // *배열입장* 에서는 게시물 저장 내용/작성자 저장 X
        Scanner scan = new Scanner(System.in);

        for( ; ; ){
            // [1] 출력함수 이용하여 화면 구성
            System.out.println("=========== My Community ==========");
            System.out.println("1.게시물작성 2.게시물출력");
            System.out.println("===================================");

            // [2] 입력함수 이용한 입력받기
            System.out.println("선택>");
            int ch = scan.nextInt();

            // [3] 분기 : 서로다 른 출력문 보여주기 위해
            if( ch ==1 ){ // create : 입력받은값 -> 객체 생성 -> 배열저장 (push x)
                scan.nextLine();
                System.out.print("내용: ");
                String content = scan.nextLine();
                System.out.print("작성자: ");
                String writer = scan.nextLine();

                Post post = new Post(content,writer);
                boolean result = false;

                for(int index=0; index<=posts.length-1 ;index++){
                    if(posts[index]==null){
                        posts[index]=post;
                        result = true;
                        break;
                    }
                }

                if(result){
                    System.out.println("[안내] 글쓰기 정공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }

            } else if( ch ==2 ){
                for(Post post : posts){
                    if(post != null){
                        System.out.printf("작성자: %s 내용: %s \n " , post.writer , post.content);
                    }

                }
            } 
        }


        

       
    }
    
}
class Post{
    String content;
    String writer;

    Post(){}

    Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
    
}
