package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.BoardDao;
import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dto.BoardDto;
import 종합예제.model.dto.ProductDto;

public class BoardController {
    private BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }

    private IBaseDao ib = BoardDao.getInstance();

    public boolean save(BoardDto boardDto) {
        // TODO 1: boardDto 전달받아 DAO의 save()를 호출하고 결과 반환
        return ib.save(boardDto);
    }

    public ArrayList<BoardDto> findAll() {
        // TODO 2: DAO의 findAll() 호출하여 결과 반환
        ArrayList<Object> objList = ib.findAll();
        ArrayList<BoardDto> result = new ArrayList<>();

    // 3. Object를 하나씩 꺼내서 ProductDto로 형변환
    for (Object obj : objList) {
        BoardDto boardDto = (BoardDto) obj;

        // 4. ProductDto 배열에 넣기
        result.add(boardDto);
    }

    // 5. 완성된 ProductDto 배열 반환
    return result;
}  
        
    }
