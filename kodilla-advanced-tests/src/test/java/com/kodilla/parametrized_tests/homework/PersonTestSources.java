package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestSources {
    private static Stream<Arguments> provideSourcesForTesting() {
        return Stream.of(
                Arguments.of(1.78, 47, "Very severely underweight"),
                Arguments.of(1.69, 45, "Severely underweight"),
                Arguments.of(1.76, 54, "Underweight"),
                Arguments.of(1.62, 60, "Normal (healthy weight)"),
                Arguments.of(1.91, 98, "Overweight" ),
                Arguments.of(1.54, 78, "Obese Class I (Moderately obese)"),
                Arguments.of(1.87, 133, "Obese Class II (Severely obese)" ),
                Arguments.of(1.69, 119, "Obese Class III (Very severely obese)"),
                Arguments.of(1.55, 115, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.73, 164, "Obese Class V (Super Obese)"),
                Arguments.of(1.78, 199, "Obese Class VI (Hyper Obese)")
        );
    }
}
