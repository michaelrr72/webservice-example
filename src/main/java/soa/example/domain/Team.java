/*
 * Example web service
 */
package soa.example.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Data for a Team
 * Note that each team has a set of players
 */
public class Team {

    String id;
    
    String name;
    
    List<Player> players = new ArrayList<>();
    
    public Team() {
    }

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Team(String id, String name, Player... players) {
        this.id = id;
        this.name = name;
        this.getPlayers().addAll(Arrays.asList(players));
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    
}
