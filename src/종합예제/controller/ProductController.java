package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dao.ProductDao;
import 종합예제.model.dto.ProductDto;

public class ProductController {
    private ProductController() {}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance() { return instance; }

    private IBaseDao ib = ProductDao.getInstance();

    public boolean save(ProductDto productDto) {
        // TODO 1: productDto 전달받아 DAO의 save()를 호출하고 결과 반환
        return ib.save(productDto);
    }




    
    public ArrayList<ProductDto> findAll() {
    // TODO 2: DAO의 findAll() 호출하여 결과를 받고 반환

    // 1. findAll을 어떻게 불러오지 ? -> ib.findAll()
    // 2. findAll()? -> ArrayList<Object> findAll() <Object>

    // 1. DAO의 findAll() 호출
    // DAO가 ArrayList<Object>를 반환함
    ArrayList<Object> objList = ib.findAll(); // 전체배열 불러오기
    // 지금 필요한게? ArrayList<ProductDto> findAll()
    // object 부모? ( 자식?-> ProductDto )
    // productDto: 여러개 -> for문 사용하여 형변환 ?
        

    // 1. DAO의 findAll() 호출
    // DAO가 ArrayList<Object>를 반환함

    // 2. 내가 최종적으로 반환해야 하는 타입
    ArrayList<ProductDto> result = new ArrayList<>();

    // 3. Object를 하나씩 꺼내서 ProductDto로 형변환
    for (Object obj : objList) {
        ProductDto productDto = (ProductDto) obj;

        // 4. ProductDto 배열에 넣기
        result.add(productDto);
    }

    // 5. 완성된 ProductDto 배열 반환
    return result;
}  
        
    }
