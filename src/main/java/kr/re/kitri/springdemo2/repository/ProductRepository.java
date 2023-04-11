package kr.re.kitri.springdemo2.repository;

import kr.re.kitri.springdemo2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    // CRUD
    // insert, update, delete, query(read, select)
    public List<Product> selectSpecialProducts() {
        // 1. DB에 접속한다.
        // 2. select * from product where code='special'.... 쿼리 전달
        // 1.2 -> repository
        // 3. 결과를 받아서 상품의 리스트로 만든다. List<Product>
        // 3. repository
        List<Product> products = List.of(
                new Product("라라리즈", 5000, true, 2, "https://www...", 100),
                new Product("드라이네일", 15000, true, 3, "https://www...", 200),
                new Product("카카스", 35000, true, 5, "https://www...", 300)
        );
        return products;
    }
}
