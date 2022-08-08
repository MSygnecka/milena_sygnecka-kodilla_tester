package com.kodilla.stream.homework;

import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {
    @Test
    public void testAverageNumberOfPostsOverAge() {
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Chandler Bing", 40, 0, "Analyst"));
        users.add(new User("Rachel Green", 25, 788, "Waiter"));
        users.add(new User("Monica Geller", 41, 220, "Cook"));
        users.add(new User("Joey Tribbiani", 39, 4397, "Actor"));
        users.add(new User("Ross Geller", 52, 5, "Paleontologist"));
        users.add(new User("Phoebe Buffay", 57, 0, "Masseuse"));

        double result = ForumStats.averageNumberOfPostsOverAge(users, 40);

        assertEquals(56.25, result, 0.001);
    }
    @Test
    public void testAverageNumberOfPostsUnderAge() {
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Chandler Bing", 40, 0, "Analyst"));
        users.add(new User("Rachel Green", 25, 788, "Waiter"));
        users.add(new User("Monica Geller", 41, 220, "Cook"));
        users.add(new User("Joey Tribbiani", 39, 4397, "Actor"));
        users.add(new User("Ross Geller", 52, 5, "Paleontologist"));
        users.add(new User("Phoebe Buffay", 57, 0, "Masseuse"));

        double result = ForumStats.averageNumberOfPostsUnderAge(users, 40);

        assertEquals(2592.5, result, 0.001);
    }
    @Test
    public void testAverageForUsersWithZeroPostsOverAge() {
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Chandler Bing", 40, 0, "Analyst"));
        users.add(new User("Rachel Green", 25, 0, "Waiter"));
        users.add(new User("Monica Geller", 41, 0, "Cook"));
        users.add(new User("Joey Tribbiani", 39, 0, "Actor"));

        double result = ForumStats.averageNumberOfPostsOverAge(users, 40);

        assertEquals(0, result, 0.001);
    }
    @Test
    public void testAverageForUsersWithZeroPostsUnderAge() {
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Chandler Bing", 40, 0, "Analyst"));
        users.add(new User("Rachel Green", 25, 0, "Waiter"));
        users.add(new User("Monica Geller", 41, 0, "Cook"));
        users.add(new User("Joey Tribbiani", 39, 0, "Actor"));

        double result = ForumStats.averageNumberOfPostsUnderAge(users, 40);

        assertEquals(0, result, 0.001);
    }
    @Test
    public void testAverageNumberOfPostsWhenNoUserOverAge() {
        ForumStats forumStats = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Joey Tribbiani", 39, 4397, "Actor"));
        users.add(new User("Ross Geller", 22, 5, "Paleontologist"));
        users.add(new User("Phoebe Buffay", 27, 0, "Masseuse"));

        double result = ForumStats.averageNumberOfPostsOverAge(users, 40);

        assertEquals(0, result, 0.001);
    }
}