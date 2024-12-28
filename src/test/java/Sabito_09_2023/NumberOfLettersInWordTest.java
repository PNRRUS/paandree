package Sabito_09_2023;

import org.junit.jupiter.api.Test;

import static Sabito_09_2023.NumberOfLettersInWord.NumberInWord;
import static org.junit.jupiter.api.Assertions.assertEquals;
class NumberOfLettersInWordTest {

    @Test
    void numberInWord() {
        assertEquals("Пять букв", NumberInWord("пакет"), "Test 5 failed");
        assertEquals("Длинное слово", NumberInWord("пригородный"), "Test 6 failed");
        assertEquals("Три буквы", NumberInWord("суп"), "Test 3 failed");
        assertEquals("Две буквы", NumberInWord("он"), "Test 2 failed");
        assertEquals("Одна буква", NumberInWord("я"), "Test 1 failed");
        assertEquals("Шесть букв", NumberInWord("огород"), "Test 7 failed");
        assertEquals("Четыре буквы", NumberInWord("карп"), "Test 4 failed");
    }
}