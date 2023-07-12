package com.abrito10.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}
