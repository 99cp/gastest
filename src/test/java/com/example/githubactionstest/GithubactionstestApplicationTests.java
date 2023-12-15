package com.example.githubactionstest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubactionstestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFail(){
        throw new RuntimeException("응 실패야 ~ ");
    }

}
