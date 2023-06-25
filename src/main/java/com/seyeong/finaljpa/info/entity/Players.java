package com.seyeong.finaljpa.info.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Players {
    @Id
    @Column(name="player_id")
    private int playerId;
    @Column(name="player_name")
    private String playerName;
    @Column(name="position")
    private String position;
    @Column(name="age")
    private int age;
    @Column(name="club")
    private String club;
    @Column(name="caps")
    private int caps;
    @Column(name="goals")
    private int goals;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries country;

    public Players() {
    }

    public Players(int playerId, String playerName, String position, int age, String club, int caps, int goals, Countries country) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.age = age;
        this.club = club;
        this.caps = caps;
        this.goals = goals;
        this.country = country;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public int getPlayerId() {
        return playerId;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }


    @Override
    public String toString() {
        return "Players{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", club='" + club + '\'' +
                ", caps=" + caps +
                ", goals=" + goals +
                ", country=" + country +
                '}';
    }
}
