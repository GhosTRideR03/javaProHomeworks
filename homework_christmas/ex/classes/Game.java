package javaProHomeworks.homework_christmas.ex.classes;

import com.github.javafaker.Faker;
import javaProHomeworks.homework_22_11_23.task_one.Classes.Employee;

import java.util.*;

public class Game {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {



        Set<Team<Pupil>> pupilTeams = quantityTeamsGenerator(4, Pupil.class);
        Set<Team<Teenager>> teenTeams = quantityTeamsGenerator(4, Teenager.class);
        Set<Team<Adult>> adultTeams = quantityTeamsGenerator(4, Adult.class);
        Map<Team<Pupil>, Double> pupilBoard = match(pupilTeams);
        Map<Team<Teenager>, Double> teenBoard = match(teenTeams);
        Map<Team<Adult>, Double> adultBoard = match(adultTeams);
        List<Team<? extends Participant>> teamsList = teamListGenerator(adultTeams, teenTeams, pupilTeams);
        printHistoryMatches(Handler.getHistoryMatches());
        teamsWithWinsOverGivenTeam(teamsList.get(0));
        System.out.println(teamsList.get(0).getName());

//        Participant youngestParticipant = youngestParticipant(teamsList);
//        System.out.println(youngestParticipant);
////        System.out.println(pupilTeams);
//        Map<Team<Pupil>, Double> pupilBoard = match(pupilTeams);
//        printStandings(pupilBoard);

    }

    static void printHistoryMatches(Map<List<Team<? extends Participant>>, List<Double>> map) {
        for (Map.Entry<List<Team<? extends Participant>>, List<Double>> entry : map.entrySet()) {
            System.out.print(entry.getKey().get(0).getName() + " // " + entry.getKey().get(1).getName() + ": ");
            for (Double num : entry.getValue()) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
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


    static <P extends Participant> List<Team<? extends Participant>> teamListGenerator
            (Set<Team<Adult>> adults, Set<Team<Teenager>> teens,
             Set<Team<Pupil>> pupils
            ) {
        List<Team<? extends Participant>> result = new ArrayList<>(adults);
        result.addAll(teens);
        result.addAll(pupils);
        return result;
    }

    static <P extends Participant> Map<Team<P>, Double> match(Set<Team<P>> teams) {
        Map<Team<P>, Double> result = new HashMap<>();
        Set<Team<P>> clone = new HashSet<>(teams);
        for (Team<P> team : teams) {
            for (Team<P> teamRival : clone) {

                if (team.equals(teamRival)) {
                    continue;
                }
                round(team, teamRival);
                result.put(team, team.getScore());
                result.put(teamRival, teamRival.getScore());
            }
            clone.remove(team);
        }
        return result;
    }

    static <P extends Participant> void round(Team<P> teamOne, Team<P> teamTwo) {
        Random random = new Random();
        int play = random.nextInt(3);
        if (play == 0) {
            Handler.addHistoryMatches(teamOne, teamTwo, 1.0);
            teamOne.setScore(teamOne.getScore() + 1);
            teamOne.setWins(teamOne.getWins() + 1);
            teamTwo.setLoses(teamTwo.getLoses() + 1);
            winStreakProcessor(teamOne, teamTwo);
        } else if (play == 1) {
            Handler.addHistoryMatches(teamOne, teamTwo, 0.5);
            teamOne.setScore(teamOne.getScore() + 0.5);
            teamOne.setDraws(teamOne.getDraws() + 1);
            teamTwo.setDraws(teamTwo.getDraws() + 1);
            teamTwo.setScore(teamTwo.getScore() + 0.5);
            drawProcessor(teamOne, teamTwo);
        } else {
            Handler.addHistoryMatches(teamOne, teamTwo, 0.0);
            teamTwo.setScore(teamTwo.getScore() + 1);
            teamTwo.setWins(teamTwo.getWins() + 1);
            teamOne.setLoses(teamOne.getLoses() + 1);
            winStreakProcessor(teamTwo, teamOne);
        }
    }

    static <P extends Participant> void winStreakProcessor(Team<P> teamOne, Team<P> teamTwo) {
        teamOne.setCurrentWinStreak(teamOne.getCurrentWinStreak() + 1);
        if (teamOne.getCurrentWinStreak() > teamOne.getMaxWinStreak()) {
            teamOne.setMaxWinStreak(teamOne.getCurrentWinStreak());
        }
        teamTwo.setCurrentWinStreak(0);
    }

    static <P extends Participant> void drawProcessor(Team<P> teamOne, Team<P> teamTwo) {
        teamOne.setCurrentWinStreak(0);
        teamTwo.setCurrentWinStreak(0);
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

    static <P extends Participant> void teamsWithWinsOverGivenTeam(Team<P> teamLoser) {
        Map<List<Team<? extends Participant>>, List<Double>> map = Handler.getHistoryMatches();
        List<Team<? extends Participant>> resultList = new ArrayList<>();
        for (Map.Entry<List<Team<? extends Participant>>, List<Double>> entry : map.entrySet()) {
            if (entry.getKey().contains(teamLoser)) {
                if (entry.getKey().get(0).equals(teamLoser)) {
                    if (entry.getValue().contains(0.0)) {
                        resultList.add(entry.getKey().get(1));
                    }
                } else {
                    if (entry.getValue().contains(1.0)) {
                        resultList.add(entry.getKey().get(0));
                    }
                }
            }
        }
        printList(resultList);
    }

    static Participant youngestParticipant(List<Team<? extends Participant>> teams) {
        Participant result = (Participant) teams.get(0).getParticipants().get(0);
        System.out.println(result);
        for (Team team : teams) {
            List<Participant> temp = team.getParticipants();
            Collections.sort(temp);
            if (temp.get(0).getAge() < result.getAge()) {
                result = temp.get(0);
            }
        }
        return result;
    }

    static <T extends Participant> void printTeamsByType(List<Team> teams, Class<T> type) {
        for (Team team : teams) {
            if (team.getParticipants().get(0).getClass().isAssignableFrom(type)) {
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