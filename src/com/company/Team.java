package com.company;

public class Team {

    private String name;
    private Member[] members;

    public Team(String name, Member member1, Member member2, Member member3, Member member4) {
        members = new Member[]{member1, member2, member3, member4};
        this.name = name;
    }

    public void getInfoAboutMembers() {
        System.out.println(name);
        for (Member member: members) {
            member.getInfo();
        }
    }

    public void getInfoAboutMembersFinished() {
        System.out.println(name);
        for (Member member: members) {
            if (member.isFinished() == true)
            member.getInfo();
        }
    }

    public Member[] getMembers() {
        return members;
    }
}
