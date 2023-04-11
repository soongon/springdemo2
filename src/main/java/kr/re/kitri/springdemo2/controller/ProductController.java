package kr.re.kitri.springdemo2.controller;

import kr.re.kitri.springdemo2.model.Product;
import kr.re.kitri.springdemo2.service.SpecialPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private SpecialPriceService specialPriceService;

    @GetMapping("/api/v1/special-price")
    public List<Product> specialPrice() {

        // 4. F/E 로 데이터를 응답한다.(response)
        // 4. 요청을 받고 응답을 해주는 역할 - controller
        return specialPriceService.viewAllSpecialPrice();
    }
}
