package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Kodilla module 7.3");
        System.out.println();

        Forum forum = new Forum();
        Map<Integer, ForumUser> par = forum.getUserList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> LocalDate.now().getYear() - f.getBirthDate().getYear() >= 20)
                .filter(f -> f.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentificationNumber, f -> f));

        System.out.println("Size of par: " + par.size());

        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
