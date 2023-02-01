package com.github.deafmist.junittestproject.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User user = new User("Gringo", "hotmexican.com");

    @Test
    public void isUserWithParametersGeneratedCorrectly() {
        assertEquals("Gringo", user.getLogin());
        assertEquals("hotmexican.com", user.getEmail());
    }

    @Test
    public void isUserWithoutParametersGeneratedCorrectly() {
        User user = new User();

        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void isEmailCorrect() {
        assertTrue(user.getEmail().contains("@") || user.getEmail().contains("."));
    }

    @Test
    public void areEmailAndLoginEqual() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}