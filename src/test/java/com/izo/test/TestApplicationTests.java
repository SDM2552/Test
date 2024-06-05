package com.izo.test;

import com.izo.test.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class TestApplicationTests {

    @MockBean
    private ProductRepository productRepository;
    @Test
    void contextLoads() {
    }

}
