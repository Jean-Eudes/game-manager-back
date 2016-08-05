package com.jeaneudes.resource;

import com.jeaneudes.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/console")
@Component
public class ConsoleResource {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private ConsoleRepository consoleRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Console> findAll() {
        Game game = new Game();
        game.setProgression(GameProgression.TO_DO);

        //System.out.println(gameRepository.findAll(Example.of(game)));

        return consoleRepository.findAll();
    }

    @GET
    @Path("/{id}/game")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Game> findGameByConsoleId(@PathParam("id") Long id) {
        Game game = new Game();
        game.setProgression(GameProgression.TO_DO);

        System.out.println(id);
        //System.out.println(gameRepository.findAll(Example.of(game)));
        System.out.println(consoleRepository.findOne(id).getGames());

        return consoleRepository.findOne(id).getGames();
    }

}
