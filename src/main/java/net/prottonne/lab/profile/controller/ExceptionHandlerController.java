/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.profile.controller;

import io.jsonwebtoken.ExpiredJwtException;
import net.prottonne.lab.common.util.exception.ErrorMessage;
import net.prottonne.lab.common.util.exception.RespondMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Jose Osuna
 */
@ControllerAdvice
public class ExceptionHandlerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(ExpiredJwtException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public RespondMessage ExpiredJwtExceptionHander(ExpiredJwtException ex) {
        logger.error("{}", ex);
        return new RespondMessage(
                ErrorMessage.EXPIRED_CODE.getValue()
        );
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public RespondMessage globalHander(Exception ex) {
        logger.error("{}", ex);
        return new RespondMessage(
                ErrorMessage.CANNOT_BE_PROCESSED.getValue()
        );
    }

}
