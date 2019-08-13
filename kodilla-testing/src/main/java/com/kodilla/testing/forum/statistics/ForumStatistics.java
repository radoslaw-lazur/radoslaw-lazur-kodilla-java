package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {

    private Statistics statistics;
    private List<String> users;
    private int posts;
    private int comments;
    private int usersSize;
    private double meanPostsPerUser;
    private double meanCommentsPerUser;
    private double meanCommentsPerPosts;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        users = statistics.usersNames();
        usersSize = statistics.usersNames().size();

        if(statistics.usersNames().size() > 0){
            meanPostsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        } else {
            meanPostsPerUser = 0;
        }
        if(statistics.usersNames().size() > 0){
            meanCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        } else {
            meanCommentsPerUser = 0;
        }
        if (statistics.postsCount() > 0){
            meanCommentsPerPosts = (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            meanCommentsPerPosts = 0;
        }
    }

    public List<String> getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public int getUsersSize() {
        return usersSize;
    }

    public double getMeanPostsperUser() {
        return meanPostsPerUser;
    }

    public double getMeanCommentsPerUser() {
        return meanCommentsPerUser;
    }

    public double getMeanCommentsPerPosts() {
        return meanCommentsPerPosts;
    }

    public void showStatistics(){
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println("Users: " + usersSize);
        System.out.println("Posts: " + posts);
        System.out.println("Comments: " + comments);
        System.out.println("Mean Posts Per User: " +  df.format(meanPostsPerUser));
        System.out.println("Mean Comments Per User: " + df.format(meanCommentsPerUser));
        System.out.println("Mean Comments Per Posts: " + df.format(meanCommentsPerPosts));
    }
}
