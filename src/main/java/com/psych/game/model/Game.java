package com.psych.game.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "games")
public class Game extends Auditable {

    @Getter
    @Setter
    @NotNull
    private int numRounds = 0;

    @Getter
    @Setter
    private int currentRound = 0;

    @ManyToMany
    @Getter
    @Setter
    private Map<Player, Stats> playerStats;
    // game_player_stats
    // game_id, player_id, stats_id

    @ManyToMany
    @Getter
    @Setter
    private List<Player> players;
    // games_players
    // game_id, player_id

    @NotNull
    @Getter
    @Setter
    private GameMode gameMode;

    @NotNull
    @Getter
    @Setter
    private GameStatus gameStatus=GameStatus.JOINING;

    @ManyToOne
    @NotNull
    @Getter
    @Setter
    private Player leader;

    @OneToMany(mappedBy = "game")
    @Getter
    @Setter
    private List<Round> rounds;

}
