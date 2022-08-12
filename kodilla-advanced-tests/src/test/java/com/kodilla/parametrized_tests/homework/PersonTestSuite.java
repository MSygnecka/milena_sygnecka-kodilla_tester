package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestSources#provideSourcesForTesting")
    public void shouldReturnVerySeverelyUnderweight(double height, double weight, String opinion) {

        Person person = new Person(height, weight);

        assertEquals(opinion, person.getBMI());

    }

}

