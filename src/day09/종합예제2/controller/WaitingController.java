package day09.종합예제2.controller;

import day09.종합예제2.model.dao.WaitingDao;
import day09.종합예제2.model.dto.WaitingDto;
import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){return instance;}
     private WaitingDao wd = WaitingDao.getInstance();

    public boolean save(WaitingDto waitingdto){
        boolean result = wd.save(waitingdto);
        return result;
    }

    public ArrayList<WaitingDto>findAll(){
        ArrayList<WaitingDto>result = wd.findAll();
        return result;
    }
    public boolean update(WaitingDto waitingDto){
        boolean result = wd.update(waitingDto);
        return result;
    }
    public boolean delete(String phoneNumber){
        boolean result = wd.delete(phoneNumber);
        return result;
    }
}
