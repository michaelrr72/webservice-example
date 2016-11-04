/*
 * Example web service
 */
package soa.example.service;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import soa.example.domain.Team;
import soa.example.logic.TeamLogic;
import soa.example.logic.TeamLogicException;

/**
 * Webserice for information of teams and players
 */
@WebService(serviceName = "TeamService")
public class TeamService {

    @Inject
    TeamLogic teamLogic;
    
    /**
     * Get a team
     */
    @WebMethod(operationName = "getTeamById")
    public Team hello(@WebParam(name = "id") String id) throws TeamLogicException {
        return teamLogic.getTeamById(id);
    }
    
    /**
     * Add a Player
     */
    @WebMethod(operationName = "addPlayerToTeam")
    public void addPlayerToTeam(
            @WebParam(name = "idTeam") String idTeam, 
            @WebParam(name = "id") String id,
            @WebParam(name = "name") String name) throws TeamLogicException {
        
        teamLogic.addPlayer(idTeam, id, name);
    }
} 
