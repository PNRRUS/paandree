package Sabito_09_2023;
import org.junit.jupiter.api.Test;

import static Python.Stepik4_3.Ruletka;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepik4_3Test {

    @Test
    void StepikTest(){
        assertEquals("зеленый",Ruletka(0));
        assertEquals("черный",Ruletka(10));
        assertEquals("черный",Ruletka(2));
        assertEquals("черный",Ruletka(10));
        assertEquals("черный",Ruletka(2));
        assertEquals("красный",Ruletka(12));
        assertEquals("красный",Ruletka(18));
        assertEquals("черный",Ruletka(11));
        assertEquals("черный",Ruletka(17));
        assertEquals("красный",Ruletka(19));
        assertEquals("красный",Ruletka(27));
        assertEquals("черный",Ruletka(20));
        assertEquals("черный",Ruletka(28));
        assertEquals("черный",Ruletka(29));
        assertEquals("черный",Ruletka(35));
        assertEquals("красный",Ruletka(30));
        assertEquals("красный",Ruletka(34));
        assertEquals("ошибка ввода",Ruletka(-1));
        assertEquals("ошибка ввода",Ruletka(37));
    }

}
