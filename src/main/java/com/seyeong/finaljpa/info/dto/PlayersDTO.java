package com.seyeong.finaljpa.info.dto;

public class PlayersDTO {
    private int playerId;
    private String playerName;
    private String position;
    private int age;
    private String club;
    private int caps;
    private int goals;
    private int countryId;

    public PlayersDTO() {
    }

    public PlayersDTO(int playerId, String playerName, String position, int age, String club, int caps, int goals, int countryId) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.age = age;
        this.club = club;
        this.caps = caps;
        this.goals = goals;
        this.countryId = countryId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "PlayersDTO{" +
                "playersId=" + playerId +
                ", playersName='" + playerName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", club='" + club + '\'' +
                ", caps=" + caps +
                ", goals=" + goals +
                ", countryId=" + countryId +
                '}';
    }
}
