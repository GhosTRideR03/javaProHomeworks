package javaProHomeworks.homework_christmas.ex.classes;

import java.util.*;

public class Handler {

    private static Set<Team<? extends Participant>> teams = new HashSet<>();
    private static Map<List<Team<? extends Participant>>, List<Double>> historyMatches = new LinkedHashMap<>();

    public static Set<Team<? extends Participant>> getTeams() {
        return teams;
    }

    public static void setTeams(Set<Team<? extends Participant>> teams) {
        Handler.teams = teams;
    }

    public static Map<List<Team<? extends Participant>>, List<Double>> getHistoryMatches() {
        return historyMatches;
    }

    public static void setHistoryMatches(Map<List<Team<? extends Participant>>, List<Double>> historyMatches) {
        Handler.historyMatches = historyMatches;
    }

    public static <T extends Participant> void addTeam(Team<T> team) {
        teams.add(team);
    }

    public static void addHistoryMatches(Team<? extends Participant> teamOne, Team<? extends Participant> teamTwo, Double score) {
        List<Team<? extends Participant>> teamList = new ArrayList<>();
        teamList.add(teamOne);
        teamList.add(teamTwo);
        historyMatches.computeIfAbsent(teamList, k -> new ArrayList<>()).add(score);
    }
}
