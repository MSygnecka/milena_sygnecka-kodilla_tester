package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames =  filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> UsersOlderThanTheValue = filterUsersOlderThanTheValue(35);
        System.out.println(UsersOlderThanTheValue);
        List<User> UsersWithMoreThanTheValueNumberOfPost = filterUsersWithMoreThanTheValueNumberOfPost (100);
        System.out.println(UsersWithMoreThanTheValueNumberOfPost);
    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static String getUserName(User user) {

        return user.getUsername();
    }
    public static List<User> filterUsersOlderThanTheValue(int age) {
        List<User> olderUsers = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());

        return olderUsers;
    }
    public static List<User> filterUsersWithMoreThanTheValueNumberOfPost (int numberOfPost) {
        List<User> selectedUsers = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .collect(Collectors.toList());

        return selectedUsers;
    }
}