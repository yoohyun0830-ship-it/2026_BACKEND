package day09;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        
         // [1] ArrayList< 요소타입 > 변수명 = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석" ); nameList.add("강호동"); nameList.add("신동엽");
        System.out.println( nameList );
        // [2] 
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for( int index = 0 ; index <= fruits.size()-1 ; index++ ){
            System.out.println( index +" : " + fruits.get(index) );
        }
        // [3] 
        for( String fruit : fruits ){ System.out.println( fruit); }
        // [4]
        ArrayList<String> list1 = new ArrayList<>();
        list1.add( "A"); list1.add( "B");  list1.add( "C");  list1.add( "D");  list1.add( "E"); 
        list1.remove( 2 );
        System.out.println( list1 );
        // [5]
        ArrayList< String > list2 = new ArrayList<>();
        list2.add("자바");  list2.add("파이썬");  list2.add("C++");
        list2.add(1, "자바스크립트"); // 중간삽입
        System.out.println( list2 );
        // [6] 내가만든 클래스/타입 으로 <제네릭타입> 가능!
        ArrayList< Book > bookList = new ArrayList<>(); 
        bookList.add( new Book("책이름1", "저자1") );
        bookList.add( new Book("책이름2", "저자2") );
        bookList.add( new Book("책이름3", "저자3") );
        for( Book book : bookList ){  System.out.println( book.getTitle() + " : " + book.getAuthor() ); }
    }
    
}

class Book{ 
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
