package ru.lamoda;

import org.junit.jupiter.api.*;

@DisplayName("Это наш первый простой тест")
public class FirstSimpleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("@beforeAll method!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    @beforeEach method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@afterAll method!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    @afterEach method!");
    }

    @DisplayName("Это простенький assertEquals")
    @Test
    void firstTest() {
        System.out.println("        Это простенький assertEquals");
        Assertions.assertEquals(1, 1);
    }

    @DisplayName("Это простенький assertTrue")
    @Test
    void secondTest() {
        System.out.println("        Это простенький assertTrue");
        Assertions.assertTrue(7 > 6);
    }
}
