package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping()
    public String list() {
        return "상품 목록";
    }

    @GetMapping("{productId}")
    public String detail(
            @PathVariable String productId
    ) {
        return "상품 상세:"+productId+"\n";
    }
}
