package com.learning.dao;

import com.learning.model.Team;

import java.util.List;

public class TeamDAOImpl implements TeamDAO{
    @Override
    public List<Team> getAllTeamsFromDB() {
        return List.of();
    }

    @Override
    public Team getTeamById(int id) {
        return null;
    }

    @Override
    public String removeTeamById(int id) {
        return "";
    }
}
