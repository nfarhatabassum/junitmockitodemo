package com.learning.dao;

import com.learning.model.Team;

import java.util.List;

public interface TeamDAO {
    public List<Team> getAllTeamsFromDB();
    public Team getTeamById(int id);
    public String removeTeamById(int id);
}
