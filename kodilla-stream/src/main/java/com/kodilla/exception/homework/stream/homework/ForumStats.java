package com.kodilla.exception.homework.stream.homework;

import com.kodilla.exception.homework.stream.UsersRepository;
import com.kodilla.exception.homework.stream.User;

import java.util.List;

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
                .orElse(0.0);
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
