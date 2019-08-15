package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identificationNumber;
    private final String userName;
    private final char sex;
    private final int posts;
    private final LocalDate birthDate;

    public ForumUser(final int identificationNumber, final String userName, final char sex,
                     final int posts, final int year, final int month, final int day) {
        this.identificationNumber = identificationNumber;
        this.userName = userName;
        this.sex = sex;
        this.posts = posts;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getPosts() {
        return posts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificationNumber=" + identificationNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", posts=" + posts +
                ", birthDate=" + birthDate +
                '}';
    }
}
