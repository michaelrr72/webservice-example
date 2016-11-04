/*
 * Example web service
 */
package soa.example.logic;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import soa.example.domain.Player;
import soa.example.domain.Team;

/**
 * Business Logic / Facade for Team data
 */
@Singleton
public class TeamLogic {  
    
    List<Team> teams = new ArrayList<>();
    
    public TeamLogic() {
    }
    
    @PostConstruct
    private void addTestData() {
        teams.add( new Team("1", "Manchester United", 
                new Player("10", "Zlatan"),
                new Player( "9", "Pogba")
            ));
        teams.add( new Team("2", "Real Madrid", 
                new Player("10", "James"),
                new Player( "7", "Cristiano")
            ));
        teams.add( new Team("3", "Barcelona FC", 
                new Player("10", "Messi")
            ));
    }
    
    public Team getTeamById(String id) throws TeamLogicException {
        
        // check all the teams in memory
        for (Team team : teams) {
            // is it the team we are looking for ?
            if (team.getId().equals(id)) {
                // return the team
                return team;
            }
        }       
        // throws an error if it does not exist in the list
        throw new TeamLogicException("There is not a Team with the id " + id);
    }
    
    
    public void addPlayer(String idTeam, String id, String name) throws TeamLogicException {
        
        // get the team
        Team team = getTeamById(idTeam);
        
        // add the new player
        Player player = new Player(id, name);
        team.getPlayers().add(player);
    }
    
    
}
