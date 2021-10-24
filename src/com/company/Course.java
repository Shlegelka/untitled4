package com.company;

public class Course {

    int[] obstacles;

    public Course(int obstacle1, int obstacle2, int obstacle3, int obstacle4) {
        obstacles = new int[]{obstacle1, obstacle2, obstacle3, obstacle4};
    }

    public void isFinishedDistance(Team team) {
        for (Member member: team.getMembers()) {
            for (int obstacle: obstacles) {
                if (member.getPossibilities() >= obstacle) {
                    member.setFinished(true);
                }
                else {
                    member.setFinished(false);
                    break;

                }
            }
        }
    }
}
