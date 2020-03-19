package com.tcc.core;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("this contextLoads");
    }

    @BeforeAll
    public static void init() {
        System.out.println("this init");
    }

    @AfterAll
    public static void done() {
        System.out.println("this done");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("this setUp");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("this tearDown");
    }

    @Test
    @DisplayName("Dummy test")
    void aTest() {
        System.out.println("As written, this test will always pass!");
    }

    @Test
    @DisplayName("A disabled test")
    void testNotRun() {
        System.out.println("This test will not run (it is disabled, silly).");
    }

}
