package com.learning.service;

import com.learning.TeamServiceImpl;
import com.learning.dao.TeamDAO;
import com.learning.model.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class TeamServiceImplTest {
    @Mock
    TeamDAO dao;

    @InjectMocks
    TeamServiceImpl teamService;

    List<Team> teams = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        teamService = new TeamServiceImpl();
        MockitoAnnotations.initMocks(this);

        teams.add(new Team(101,"Hockey","India"));
        teams.add(new Team(102,"Cricket","Australia"));
        teams.add(new Team(103,"BaseBall","Japan"));
        teams.add(new Team(104,"Football","France"));
        teams.add(new Team(105,"BasketBall","USA"));
    }

    @Test
    public void testGetAllTeams(){
     when(dao.getAllTeamsFromDB()).thenReturn(teams);
    String data = teamService.getAllTeams().get(0).getCountry();
     assertEquals("India",data,"Expected India But Found "+data);

    }
    @Test
    public void testGetTeamById(){
        when(dao.getTeamById(103)).thenReturn(teams.get(2));
        String data = teamService.getTeam(103).getTeamName();
        assertEquals("BaseBall",data,"Expected Baseball but found "+data);
    }
    @Test
    public void testRemoveTeamById(){
        when(dao.removeTeamById(103)).thenReturn("Success");
        assertTrue(teamService.removeTeam(103));
    }

}
