package com.igorth.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorth.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {
    
}
