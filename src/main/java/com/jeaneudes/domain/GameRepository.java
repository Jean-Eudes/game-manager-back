package com.jeaneudes.domain;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface GameRepository extends Repository<Game, Long>, QueryByExampleExecutor<Game> {

    List<Game> findAll();

}
