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

class RectangleTest {

    @Test
    void shouldReturnTheBase() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.getBase(), 2);
    }

    @Test
    void theHeightShouldBeEqualToTheSide() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.getHeight(), 4);
    }

    @Test
    void shouldReturnThePerimeter() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.perimeter(), 12);
    }

    @Test
    void shouldReturnTheArea() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.area(), 8);
    }

}