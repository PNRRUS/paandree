package Sabito_09_2023;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static Python.Mixer_1.mixer_color;

public class Mixer_1_Test {
    @Test
    void Mix_color() {
        assertEquals("фиолетовый", mixer_color("красный", "синий"), "Test 1 failed");
        assertEquals("красный", mixer_color("красный", "красный"), "Test 2 failed");
        assertEquals("ошибка цвета", mixer_color("питон", "питон"), "Test 3 failed");
        assertEquals("оранжевый", mixer_color("красный", "желтый"), "Test 4 failed");
        assertEquals("зеленый", mixer_color("желтый", "синий"), "Test 5 failed");
        assertEquals("ошибка цвета", mixer_color("желтый", "блаблабла"), "Test 5 failed");
    }
}
