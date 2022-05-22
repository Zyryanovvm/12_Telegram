package simpleTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Позитивные тесты")
public class PositiveAutoTests {

    @Test
    void test01() {
        assertTrue(true);
        System.out.println("Позитивный тест 01 выполнен");
    }
    @Test
    void test02() {
        assertTrue(true);
        System.out.println("Позитивный тест 02 выполнен");
    }
    @Test
    void test03() {
        assertTrue(true);
        System.out.println("Позитивный тест 03 выполнен");
    }
    @Test
    void test04() {
        assertTrue(true);
        System.out.println("Позитивный тест 04 выполнен");
    }
    @Test
    void test05() {
        assertTrue(true);
        System.out.println("Позитивный тест 05 выполнен");
    }
    @Test
    void test06() {
        assertTrue(true);
        System.out.println("Позитивный тест 06 выполнен");
    }
    //curl -X POST \
    //     -H 'Content-Type: application/json' \
    //     -d '{"chat_id": "-1001167409248", "text": "This is a test from curl", "disable_notification": false}' \
    //     https://api.telegram.org/bot5268129355:AAEIREjSC3xu0vOEz_XPjvRdQ4QlxlAL7bg/sendMessage
}
