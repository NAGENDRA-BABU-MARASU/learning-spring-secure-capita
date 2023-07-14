package io.learning.securecapita.exception;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 13:55
 */

public class ApiException extends RuntimeException {
    public ApiException(String message){
        super(message);
    }

}
