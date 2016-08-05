package com.jeaneudes.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface GameToBuyRepository extends Repository<GameToBuy, Long> {

    List<GameToBuy> findAll();

}
