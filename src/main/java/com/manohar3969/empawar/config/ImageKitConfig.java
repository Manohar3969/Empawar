package com.manohar3969.empawar.config;

import io.imagekit.sdk.ImageKit;
import io.imagekit.sdk.config.Configuration;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ImageKitConfig {

    @PostConstruct
    public void init() {
        Configuration config = new Configuration(
                "public_L/dmAOuxznI7wU74QHsN7YLctgo=",
                "private_3cteP1PFd41xqergCFnfFXvIZqM=",
                "https://ik.imagekit.io/fipqp73ir/"
        );

        ImageKit.getInstance().setConfig(config);
    }
}

