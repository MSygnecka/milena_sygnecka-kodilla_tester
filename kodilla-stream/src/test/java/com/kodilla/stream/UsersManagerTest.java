package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // given
        UsersManager usersManager = new UsersManager();
        UsersRepository usersRepository = new UsersRepository();

        // when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        // then
        List<String> expectedList = new ArrayList<>();
        expectedList.add(new String("Walter White"));
        expectedList.add(new String("Gale Boetticher"));
        assertEquals(expectedList, result);
    }

   @Test
   public void testFilterUsersOlderThanTheValue() {
        // given
        UsersManager usersManager = new UsersManager();
        UsersRepository usersRepository = new UsersRepository();

        // when
        List<User> outcome = UsersManager.filterUsersOlderThanTheValue(35);

        // then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, outcome);
   }
   @Test
    public void testFilterUsersWithMoreThanTheValueNumberOfPost() {
        // given
        UsersManager usersManager = new UsersManager();
        UsersRepository usersRepository = new UsersRepository();

        // when
       List<User> effect = UsersManager.filterUsersWithMoreThanTheValueNumberOfPost(100);

       // then
       List<User> expectedList = new ArrayList<>();
       expectedList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
       expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
       assertEquals(expectedList, effect);
   }

}