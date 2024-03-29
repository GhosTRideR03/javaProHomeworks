package javaProHomeworks.homework_christmas.ex.classes;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Team<P extends Participant> implements Comparable<Team> {

    private Faker FAKER = new Faker();

    private String name;
    private List<P> participants = new ArrayList<>(100);
    private double score;
    private int wins;
    private int draws;
    private int loses;
    private int maxWinStreak;
    private int currentWinStreak;


    public Team(String name) {
        this.name = name;
    }

    public int getMaxWinStreak() {
        return maxWinStreak;
    }

    public void setMaxWinStreak(int maxWinStreak) {
        this.maxWinStreak = maxWinStreak;
    }

    public int getCurrentWinStreak() {
        return currentWinStreak;
    }

    public void setCurrentWinStreak(int currentWinStreak) {
        this.currentWinStreak = currentWinStreak;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<P> getParticipants() {
        return participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team<?> team = (Team<?>) o;
        return Objects.equals(name, team.name) && Objects.equals(participants, team.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, participants);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name: " + name + '\'' +
                ", participants: " + participants +
                ", score: " + score +
                '}';
    }


    @Override
    public int compareTo(Team o) {
        if (this.getScore() == o.getScore()) {
            return 0;
        } else if (this.getScore() > o.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }

    public void addNewParticipant(P newParticipant) {
        participants.add(newParticipant);
    }

    public void play(Team<P> teamPlayWith) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winner = this.name;
        } else {
            winner = teamPlayWith.name;
        }

        System.out.println("*****Winner is: " + winner + "*****");
    }

    public <T extends Participant> void generateTeam(int teamMembers, Class<T> type) {
        if (Pupil.class.isAssignableFrom(type)) {
            for (int i = 1; i <= teamMembers; i++) {
                this.addNewParticipant((P) new Participant(FAKER.name().name(), FAKER.number().numberBetween(7, 13)));
            }
        }

        if (Teenager.class.isAssignableFrom(type)) {
            for (int i = 1; i <= teamMembers; i++) {
                this.addNewParticipant((P) new Participant(FAKER.name().name(), FAKER.number().numberBetween(13, 19)));
            }
        }

        if (Adult.class.isAssignableFrom(type)) {
            for (int i = 1; i <= teamMembers; i++) {
                this.addNewParticipant((P) new Participant(FAKER.name().name(), FAKER.number().numberBetween(19, 30)));
            }
        }
    }
}