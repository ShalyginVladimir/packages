package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calcWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.countSquares(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

}