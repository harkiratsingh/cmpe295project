package edu.sjsu.cmpe295.resonance.exceptions;

/**
 * Created by harkirat singh on 11/29/2015.
 */
public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException(String message) {
        super(message);
    }
}
