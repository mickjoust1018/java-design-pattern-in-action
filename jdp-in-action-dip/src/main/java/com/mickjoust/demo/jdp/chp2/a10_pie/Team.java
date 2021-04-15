package com.mickjoust.demo.jdp.chp2.a10_pie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mickjoust
 * 获取球队比赛得分
 **/
public class Team {

    private Set<String> playerNames = new HashSet();
    private int score = 0;

    private Boolean containsPlayer(String playerName) {
        return playerNames.contains(playerName);
    }

    int getScore() {
        return score;
    }

    int getTeamScoreForPlayer(List<Team> teams, String playerName) {
        for (Team team :teams) {
            if (team.containsPlayer(playerName)) {
                return team.getScore();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
//        teams.add();
//        teams.add();

    }
}
