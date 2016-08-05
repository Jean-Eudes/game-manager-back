package com.jeaneudes.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ConsoleRepository extends Repository<Console, Long> {

    List<Console> findAll();

    Console findOne(Long consoleId);
}
