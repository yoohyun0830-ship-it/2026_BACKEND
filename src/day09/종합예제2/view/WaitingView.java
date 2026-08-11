package day09.종합예제2.view;


import java.util.ArrayList;
import java.util.Scanner;

import day09.종합예제2.controller.WaitingController;
import day09.종합예제2.model.dto.WaitingDto;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){return instance;}
    private WaitingController wc = WaitingController.getInstance();

    private Scanner scan = new Scanner(System.in);
     public void run(){
        while (true) {
        System.out.println("============================================================");
        System.out.println("1. 대기등록  2. 대기출력  3. 대기수정  4. 대기삭제 ");
        System.out.println("============================================================");
        System.out.print("선택 > ");
        
        int ch = scan.nextInt();
        if(ch == 1) {
                save();
            }
            else if(ch == 2) {
                findAll();
            }
            else if(ch == 3) {
                update();
            }
            else if(ch == 4) {
                delete();
            }
             else {
                System.out.println("[안내] 잘못된 번호입니다.");
            }

        }
    }

    public void save(){
        System.out.print("전화번호 : ");
        String phoneNumber = scan.next();

        System.out.print("방문 인원 :");
        int member = scan.nextInt();

        WaitingDto dto = new WaitingDto(phoneNumber,member);
        boolean result = wc.save(dto);
        if(result){
            System.out.println("[안내] 대기명단 등록 성공");
        }
        else{System.out.println("[안내] 대기명단 등록 실패");}
    }

    public void findAll(){
        ArrayList<WaitingDto>result = wc.findAll();
        System.out.println("=================대기명단================");
        for(WaitingDto dto : result ){
            System.out.println(
                "전화번호" + dto.getPhoneNumber()
                + "/ 방문인원 : " + dto.getMember()
            );
        }
         System.out.println("=======================================");
    }
    public void update(){
        System.out.println("수정할 전화번호 : ");
        String phoneNumber = scan.next();

        System.out.println("변경할 방문 인원 :");
        int member = scan.nextInt();

        WaitingDto dto = new WaitingDto(phoneNumber,member);
        boolean result = wc.update(dto);

        if(result){
            System.out.println("[안내]대기명단 수정 성공");
        }
        else{
            System.out.println("[안내] 해당 전화번호를 찾을 수 없습니다.");
        }
    }

    public void delete(){
        System.out.println("삭제할 전화번호: ");
        String phoneNumber = scan.next();
        boolean result = wc.delete(phoneNumber);

        if(result){
            System.out.println("[안내]대기명단 삭제 성공");
        }
        else{System.out.println("[안내]해당 전화번호를 찾을 수 없습니다.");}
    }
}

