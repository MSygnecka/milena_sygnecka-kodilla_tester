package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    public Set<Integer> splitString(String input) {
        String[] strings = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String item : strings) {
            Integer number = Integer.parseInt(item);
            numbers.add(number);
        }
        return numbers;
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/rightNumberOfElements.csv")
    public void shouldReturnRightNumberOfElements(String numbers) throws InvalidNumbersException {

        Set<Integer> item = splitString(numbers);

        assertDoesNotThrow( () ->gamblingMachine.howManyWins(item));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumberOfElements.csv")
    public void HowManyWinsWithWrongNumbersOfElements(String numbers) throws InvalidNumbersException {

        Set<Integer> item = splitString(numbers);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(item));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/duplicateNumberInTheList.csv")
    public void HowManyWinsWithDuplicateNumberInTheList(String numbers) throws InvalidNumbersException {

        Set<Integer> item = splitString(numbers);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(item));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutsideTheRangeOfTheList.csv")
    public void HowManyWinsWithNumbersOutsideTheRangeOfTheList(String numbers) throws InvalidNumbersException {

        Set<Integer> item = splitString(numbers);

        assertThrows(InvalidNumbersException.class, ()-> gamblingMachine.howManyWins(item));
    }



}