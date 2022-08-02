package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech.NOUN;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("London");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Warsaw"));
        expectedList.add(new Flight("London", "Berlin"));
        assertEquals(expectedList,  result);
    }
    @Test public void findFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Berlin"));
        expectedList.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedList, result);
    }


}