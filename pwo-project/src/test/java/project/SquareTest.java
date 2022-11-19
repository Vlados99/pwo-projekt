/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author vladi
 */

class SquareTest {

    @Test
    void shouldReturnTheSide() {
        Square square = new Square(2);
        assertEquals(square.side(), 2);
    }

    @Test
    void theHeightShouldBeEqualToTheSide() {
        Square square = new Square(2);
        assertEquals(square.getHeight(), 2);
    }

    @Test
    void shouldReturnThePerimeter() {
        Square square = new Square(2);
        assertEquals(square.perimeter(), 8);
    }

    @Test
    void shouldReturnTheArea() {
        Square square = new Square(2);
        assertEquals(square.area(), 4);
    }
}
