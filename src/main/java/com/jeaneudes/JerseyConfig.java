package com.jeaneudes;

import com.jeaneudes.resource.ConsoleResource;
import com.jeaneudes.resource.GameToBuyResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ConsoleResource.class);
        register(GameToBuyResource.class);
    }

}