package com.david.gamecollection.repositories;

import com.david.gamecollection.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, String> {

    Game findById(long id);
}
