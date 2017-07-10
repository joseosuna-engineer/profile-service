/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.controller;

import net.prottonne.lab.profile.entity.RequestProfile;
import net.prottonne.lab.profile.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Osuna
 */
@RestController
public class ProfileController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public User getProfile(
            @RequestBody RequestProfile requestProfile
    ) {

        logger.info("requestProfile {}", requestProfile);

        User user = new User();
        user.setId(101001L);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail(requestProfile.getEmail());

        logger.info("responseProfile {}", user);

        return user;
    }

}
