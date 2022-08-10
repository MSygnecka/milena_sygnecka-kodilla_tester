package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"test", "Test2"})
    public void isTheUsernameCorrect (String input) {
        assertTrue(validator.validateUsername(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"test/1", "Test2022#"})
    public void isTheUsernameIncorrect (String input) {
        assertFalse(validator.validateUsername(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"kasia.kowalska@wp.pl", "aniaNowak83@onet.pl"})
    public void isTheEmailCorrect (String input) {
        assertTrue(validator.validateEmail(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"kasia.kowalska.lego@wp_pl", "@ania-nowak@Onet"})
    public void isTheEmailIncorrect (String input) {
        assertFalse(validator.validateEmail(input));
    }
}