package com.company;

public class Main {

    public static void main(String[] args) {

        Member member1 = new Member("Vadim1", 100);
        Member member2 = new Member("Vadim2", 140);
        Member member3 = new Member("Vadim3", 90);
        Member member4 = new Member("Vadim4", 120);

        Team team = new Team("Инертная масса", member1, member2, member3, member4);

        Course course = new Course(80,110,50,60);

        course.isFinishedDistance(team);

        team.getInfoAboutMembers();
        System.out.println();
        team.getInfoAboutMembersFinished();



    }
}
