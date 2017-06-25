/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.controller;

import net.prottonne.lab.common.util.auth.JwtUtil;
import net.prottonne.lab.common.util.header.constant.HeaderConstant;
import net.prottonne.lab.profile.entity.RequestProfile;
import net.prottonne.lab.profile.entity.ResponseProfile;
import net.prottonne.lab.profile.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
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
            value = "/",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseProfile getProfile(
            @RequestHeader(value = HeaderConstant.AUTHORIZATION_HEADER) String header,
            @RequestBody RequestProfile requestProfile
    ) {

        JwtUtil.validateJwtToken(header);

        User user = new User();
        user.setId("3CE699EB71CF453BA5A8EA73426083C0");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@prottonne.net");

        return new ResponseProfile(user);
    }

}
