package day09.종합예제2.model.dao;

import java.util.ArrayList;

import day09.종합예제2.model.dto.WaitingDto;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){return instance;}
    private ArrayList<WaitingDto> waitingList = new ArrayList<>();

    public boolean save(WaitingDto waitingDto){
        waitingList.add(waitingDto);
        return true;
    }
    public ArrayList<WaitingDto>findAll(){
        return waitingList;
    }
    public boolean update(WaitingDto waitingDto){
        for(WaitingDto dto : waitingList){
             if(dto.getPhoneNumber().equals(waitingDto.getPhoneNumber())){
                dto.setMember(waitingDto.getMember());
                return true;
        }
    }
     return false;
    }
     public boolean delete(String phoneNumber){
        for(int i = 0; i < waitingList.size(); i++){
            WaitingDto dto = waitingList.get(i);
            if(dto.getPhoneNumber().equals(phoneNumber)){
                waitingList.remove(i);
                return true;
            }
        }

        return false;
}
}