/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.controller;

import net.prottonne.lab.common.util.auth.JwtUtil;
import net.prottonne.lab.profile.constant.ConfigurationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
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
            value = "/profile",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public String getProfile(
            @RequestHeader(value = ConfigurationConstant.AUTHORIZATION_HEADER) String header
    ) {

        JwtUtil.validateJwtToken(header);

        return "my profile";
    }

}
