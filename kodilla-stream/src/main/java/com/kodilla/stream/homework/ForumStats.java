package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.Optional;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averageNumberOfPostsOverAge(UsersRepository.getUsersList(), 40));
        System.out.println(averageNumberOfPostsUnderAge(UsersRepository.getUsersList(), 40));
    }
    public static double averageNumberOfPostsOverAge(List<User> users, int age) {

        double result = users
                .stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return result;
    }
    public static double averageNumberOfPostsUnderAge(List<User> users, int age) {
        double result = users
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return result;
    }
}
