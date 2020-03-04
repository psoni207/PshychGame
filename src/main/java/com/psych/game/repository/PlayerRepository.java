package com.psych.game.repository;

import com.psych.game.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}

/*
Serialization
* a = Person(name="pragy", age=26)
* {name:"pragy", age=26}
* yaml
* a:
*   name = pragy
*   age 26

 */