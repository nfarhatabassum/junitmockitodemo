package com.learning.model;


public class Team {
    private int teamId;
    private String teamName;
    private String country;

    public Team() {
    }

    public Team(int teamId, String teamName, String country) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.country = country;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
