package com.jeaneudes.resource;

import com.jeaneudes.domain.Game;
import com.jeaneudes.domain.GameToBuy;
import com.jeaneudes.domain.GameToBuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Path("/gameToBuy")
@Component
public class GameToBuyResource {

    @Autowired
    private GameToBuyRepository gameToBuyRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> findAll() {
        return gameToBuyRepository.findAll().stream().map(GameToBuy::getGame).collect(toList());
    }

}
