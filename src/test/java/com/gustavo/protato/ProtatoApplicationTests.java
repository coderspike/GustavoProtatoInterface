package com.gustavo.protato;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class ProtatoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(Objects.equals(null, "小六六"));

    }

}
