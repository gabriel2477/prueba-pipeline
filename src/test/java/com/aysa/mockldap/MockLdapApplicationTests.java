package com.aysa.mockldap;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MockLdapApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void validateTest(){
        int x = 0;
        assertTrue(x == 1);
    }

}
