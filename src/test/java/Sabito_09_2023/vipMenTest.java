package Sabito_09_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Sabito_09_2023.vipMen.*;

class vipMenTest {

    @Test
    void testVipMenSolution() {
        assertEquals("Добро пожаловать!", vipMenSolution("Здорово, это Илон Маск!"),
                "Test 1 failed");
        assertEquals("Добро пожаловать!", vipMenSolution("Здорово, не узнаешь? это Билл Гейтс!"),
                "Test 2 failed");
        assertEquals("Добро пожаловать!", vipMenSolution("Здорово, это Джефф Безос!"),
                "Test 3 failed");
        assertEquals("Добро пожаловать!", vipMenSolution("Здорово, это  Марк Цукерберг!"),
                "Test 4 failed");
        assertEquals("Здесь никого нет, Вы ошиблись дверью", vipMenSolution("Эдисон приветствует"),
                "Test 5 failed");
    }
}