package kr.re.kitri.springdemo2.service;

import kr.re.kitri.springdemo2.model.Product;
import kr.re.kitri.springdemo2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialPriceService {

    @Autowired private ProductRepository productRepository;

    public List<Product> viewAllSpecialPrice() {

        // 3-1. service는 데이터를 repository에서 받아서 controller로 토스해준다.
        // .. respository에게 일을 시킨다.
        return productRepository.selectSpecialProducts();
    }
}
