package day04;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int[] array = new int[0];

        while (true) {

            // 현재 배열 출력
            System.out.print("현재 배열 : [");

            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }

            System.out.println("]");

            // 메뉴 출력
            System.out.println("1. 요소 추가");
            System.out.println("2. 인덱스 삭제");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");

            int menu = scan.nextInt();

            // 요소 추가
            if (menu == 1) {

                System.out.print("추가할 숫자 : ");
                int value = scan.nextInt();

                // 기존 배열보다 한 칸 큰 배열 생성
                int[] newArray = new int[array.length + 1];

                // 기존 배열 값 복사
                for (int index = 0; index < array.length; index++) {
                    newArray[index] = array[index];
                }

                // 새 배열의 마지막 칸에 값 추가
                newArray[newArray.length - 1] = value;

                // 기존 배열을 새 배열로 변경
                array = newArray;
            }

            // 인덱스 삭제
            else if (menu == 2) {

                System.out.print("삭제할 인덱스 : ");
                int deleteIndex = scan.nextInt();

                // 기존 배열보다 한 칸 작은 배열 생성
                int[] newArray = new int[array.length - 1];

                int newIndex = 0;

                // 삭제할 인덱스를 제외하고 복사
                for (int index = 0; index < array.length; index++) {

                    if (index != deleteIndex) {
                        newArray[newIndex] = array[index];
                        newIndex++;
                    }
                }

                // 기존 배열을 새 배열로 변경
                array = newArray;
            }

            // 종료
            else if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}