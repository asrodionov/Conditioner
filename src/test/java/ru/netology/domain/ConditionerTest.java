package ru.netology.domain;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestMethodOrder(OrderAnnotation.class)
class ConditionerTest {

    static Conditioner conditioner = new Conditioner();

    @Test
    @Order(1)
      void shouldIncreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(2)
    public void shouldIncreaseCurrentTemperature2() {
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(3)
    public void shouldIncreaseCurrentTemperature3() {
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(4)
    public void shouldIncreaseCurrentTemperature4() {
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(5)
    public void shouldIncreaseCurrentTemperature5() {
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(6)
    public void shouldIncreaseCurrentTemperature6() {
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(7)
    public void shouldDecreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(8)
    public void shouldDecreaseCurrentTemperature2() {
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(9)
    public void shouldDecreaseCurrentTemperature3() {
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    @Order(10)
    public void shouldDecreaseCurrentTemperature4() {
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(16, conditioner.getCurrentTemperature());
    }
    @Test
    @Order(11)
    public void shouldDecreaseCurrentTemperature5() {
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(15, conditioner.getCurrentTemperature());
    }
    @Test
    @Order(12)
    public void shouldDecreaseCurrentTemperature6() {
        conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}
