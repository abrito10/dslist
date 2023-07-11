package com.abrito10.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
