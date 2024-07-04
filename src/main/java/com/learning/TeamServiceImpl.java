package com.learning;

import com.learning.dao.TeamDAO;
import com.learning.dao.TeamDAOImpl;
import com.learning.model.Team;

import java.util.List;

public class TeamServiceImpl {
    private TeamDAO dao;
    public TeamServiceImpl(){
        dao = new TeamDAOImpl();
    }

    public List<Team> getAllTeams(){
        return dao.getAllTeamsFromDB();
    }

    public Team getTeam(int id){
        return dao.getTeamById(id);
    }
    public boolean removeTeam(int id){
        String message = dao.removeTeamById(id);
        if(message.equalsIgnoreCase("success")){
            return true;
        }
        return false;
    }
}
