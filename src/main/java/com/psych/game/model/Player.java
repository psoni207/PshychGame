package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "players")    // Mapping b/w java class and table row
public class Player extends Auditable {


    @Getter
    @Setter
    @NotBlank
    private String name;

    @Getter
    @Setter
    @URL
    private String psychFaceURL;

    @Getter
    @Setter
    @URL
    private String picURL;

    @OneToOne
    @Getter
    @Setter
    private Stats stats;

    @ManyToMany(mappedBy = "players")
    @Getter
    @Setter
    private List<Game> games;

}

/*
players_games
player_id, game_id
        1, 1
        1, 3
        2, 1

 */