package day05;

class Book {
  String title;
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}
public class Main {
  public static void main(String[] args) {
    Book b1 = new Book("Java Basics"); // 생성 // "Java Basics"
    Book b2 = new Book("OOP Concepts"); // 생성 // b2->oop-> b2 = L[0}=> JB 이므로 사라짐 //"OOP Concepts"

    Book[] library = new Book[3]; 

    library[0] = b1;
    library[1] = new Book("Data Structure"); // 생성 // b3+L[1] (유효) // "Data Structure"

    Book b3 = library[1]; 

    b2 = library[0]; // Java Basics

    Book[] archive = library;
    archive[2] = new Book("Algorithm"); // 생성 // "Algorithm"

    library[0] = null;
    b1 = null; // b2->가 가리키고 있음 (유효)

    // ===== 프로그램 실행 종료 직전 (Final State) =====
    // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
    // 만들어진 인스턴스 개수 : 4개 만들어짐 
    // main 함수가 종료되기 전 유효한 인스턴스 개수 :3
    // 사라진 인스턴스 개수 :1
  }
}

// 배열의 인스턴스까지 : 5/4/1
// book 인스턴스 : 4/3/1