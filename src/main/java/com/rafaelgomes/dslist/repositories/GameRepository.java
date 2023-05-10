package com.rafaelgomes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelgomes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
