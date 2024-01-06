package javaProHomeworks.homework_christmas.ex.classes;

import com.github.javafaker.Faker;

import java.util.*;

public class Game {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {


        Set<Team<Pupil>> pupilTeams = quantityTeamsGenerator(3, Pupil.class);
//        System.out.println(pupilTeams);
        Map<Team<Pupil>, Double> pupilBoard = match(pupilTeams);
        printStandings(pupilBoard);

    }

    static <P extends Participant> void printStandings(Map<Team<P>, Double> map) {
        for (Map.Entry<Team<P>, Double> team : map.entrySet()) {
            System.out.println("Team: " + team.getKey().getName() + ", score = " + team.getValue());
        }
    }

    static void printList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    static <P extends Participant> Map<Team<P>, Double> match(Set<Team<P>> teams) {
        Map<Team<P>, Double> result = new HashMap<>();
        Set<Team<P>> clone = new HashSet<>(teams);
        for (Team<P> team : teams) {
            for (Team<P> teamRival : clone) {
                if (team.equals(teamRival)) {
                    continue;
                }
                if (!result.containsKey(team)) {
                    result.put(team, 0.0);
                }
                if (!result.containsKey(teamRival)) {
                    result.put(teamRival, 0.0);
                }
                Map<Team<P>, Double> temp = round(team, teamRival);
                for (Map.Entry<Team<P>, Double> teamRes : temp.entrySet()) {

                    result.put(teamRes.getKey(), result.get(teamRes.getKey()) + teamRes.getValue());
                }
            }
            clone.remove(team);
        }
        return result;
    }


    static <P extends Participant> Map<Team<P>, Double> round(Team teamOne, Team teamTwo) {
        Map<Team<P>, Double> result = new HashMap<>();
        Random random = new Random();
        int play = random.nextInt(3);
        if (play == 0) {
            result.put(teamOne, teamOne.getScore() + 1);
            teamOne.setScore(teamOne.getScore() + 1);
            teamOne.setWins(teamOne.getWins() + 1);
            teamTwo.setLoses(teamTwo.getLoses() + 1);
        } else if (play == 1) {
            result.put(teamOne, teamOne.getScore() + 0.5);
            result.put(teamTwo, teamTwo.getScore() + 0.5);
            teamOne.setScore(teamOne.getScore() + 0.5);
            teamTwo.setScore(teamTwo.getScore() + 0.5);
        } else {
            result.put(teamTwo, teamTwo.getScore() + 1);
            teamOne.setScore(teamTwo.getScore() + 1);
            teamOne.setWins(teamTwo.getWins() + 1);
            teamTwo.setLoses(teamOne.getLoses() + 1);
        }
        return result;
    }

    static <T extends Participant> Set<Team<T>> quantityTeamsGenerator(int quantity, Class<T> type) {
        Set<Team<T>> result = new HashSet<>();
        for (int i = 1; i <= quantity; i++) {
            String name = "Team " + type.getSimpleName() + " " + i;
            Team<T> team = new Team<>(name);
            team.generateTeam(4, type);
            result.add(team);
        }
        return result;
    }

    static <T extends Participant> void printTeamsByType(List<Team> teams, Class<T> type) {
        for (Team team : teams) {
            if (team.getClass().isAssignableFrom(type)) {
                System.out.println(team.getName() + " has " + type + " category.");
            }
        }
    }

    static void sortTeamsByScore(List<Team> teams) {
        Collections.sort(teams);
    }

    static List<Team> teamsWithScoreHigherThanAverage(List<Team> teams) {
        double sumOfScores = sumOfScores(teams);
        double averageScore = 0;
        List<Team> teamsWithHighScore = new ArrayList<>();

        averageScore = sumOfScores / teams.size();
        for (Team team : teams) {
            if (team.getScore() > averageScore) {
                teamsWithHighScore.add(team);
            }
        }
        return teamsWithHighScore;
    }

    static void averageTeamAge(List<Team> teams) {
        for (Team team : teams) {
            int avgAge = 0;
            List<Participant> participants = team.getParticipants();
            for (Participant participant : participants) {
                avgAge += participant.getAge();
            }
            System.out.println("Team " + team + " average age is: " + avgAge);
        }
    }

    static List<Team> teamsWithNoScore(List<Team> teams) {
        List<Team> teamsWithoutScore = new ArrayList<>();
        for (Team team : teams) {
            if (team.getScore() == 0) {
                teamsWithoutScore.add(team);
            }
        }
        return teamsWithoutScore;
    }

    static double sumOfScores(List<Team> teams) {
        double sumOfScores = 0;
        for (Team team : teams) {
            sumOfScores += team.getScore();
        }
        return sumOfScores;
    }

    static Team highestScoreTeam(List<Team> teams) {
        Collections.sort(teams);
        return teams.get(teams.size() - 1);
    }
}