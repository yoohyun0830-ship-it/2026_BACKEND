package day07;

import java.util.Scanner;

public class Activity {
   

            public static void main(String[] args) {
        OverallRepository repository = new OverallRepository();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("===================== 세탁도우미 ===================== ");
            System.out.println("1.의류 추가 2. 세탁법추가 3. 의류 출력 4. 세탁법 출력");
            System.out.println("====================================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:
                    scan.nextLine();
                    System.out.print("의류 ID : ");

                    int 의류ID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("물온도 : ");
                    String 물온도 = scan.nextLine();
                    System.out.print("세탁방법 : ");
                    String 세탁방법 = scan.nextLine();
                    System.out.print("권장세제 : ");
                    String 권장세제 = scan.nextLine();
                    System.out.print("주의사항 : ");
                    String 주의사항 = scan.nextLine();

                    의류별세탁법 추가할세탁법 = new 의류별세탁법(의류ID, 물온도, 세탁방법, 권장세제, 주의사항);
                    boolean result = repository.세탁법저장(추가할세탁법);

                    if (result)
                        System.out.println("[안내] 세탁법 추가 성공");
                    else
                        System.out.println("[안내] 세탁법 추가 실패");
                    break;

                case 3:

                    break;

                case 4: 
                의류별세탁법[] 세탁법리스트 =  repository.findAll();
                        for (의류별세탁법 clothes : 세탁법리스트) {

                        if (clothes != null) {
                        System.out.printf(
                                "의류 번호 : %d, 의류명 : %s, 카테고리 번호 : %d, 소재 번호 : %d, 이미지 경로 : %s\n",
                                clothes .의류ID,
                                clothes.물온도,
                                clothes.세탁방법,
                                clothes.권장세제,
                                clothes.주의사항);}
                        }

                  
                    break;

                default:
                    break;
            }
          
        }
    }
                
            }
    
class OverallRepository {

    Post[] posts = new Post[100];

    의류별세탁법[] 세탁법리스트 = new 의류별세탁법[100];

    // 세탁법 저장
    boolean 세탁법저장(의류별세탁법 추가할세탁법) {
        for (int i = 0; i < 세탁법리스트.length; i++) {
            if (세탁법리스트[i] == null) {
                세탁법리스트[i] = 추가할세탁법;
                return true;
            }
        }
        return false;
    }

    // 세탁법 반환
    의류별세탁법[] findAll() {
        return 세탁법리스트;
    }

}


class 의류별세탁법 {
    int 의류ID;
    String 물온도;
    String 세탁방법;
    String 권장세제;
    String 주의사항;

    의류별세탁법() {
    }

    의류별세탁법(int 의류ID, String 물온도, String 세탁방법, String 권장세제, String 주의사항) {
        this.의류ID = 의류ID;
        this.물온도 = 물온도;
        this.세탁방법 = 세탁방법;
        this.권장세제 = 권장세제;
        this.주의사항 = 주의사항;
    }
}
class 세탁기호{
    int 기호ID;
    String 기호명;
    String 이미지경로;
}

class 카테고리{
    int 카테고리ID;
    String 카테고리명;
}

class 의류{
    int 의류ID;
    String 의류명;
    int 카테고리ID;
    int 소재ID;
    String 이미지경로;
}

class 건조방법{
  int 건조ID;
  String 건조방법;
  String 방법;
  String 장점;
  String 주의사항;
}