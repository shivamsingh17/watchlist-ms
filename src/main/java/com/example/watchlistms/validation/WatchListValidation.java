package com.example.watchlistms.validation;

import com.example.watchlistms.dto.ErrorResponse;
import org.springframework.stereotype.Component;

@Component
public class WatchListValidation {
    public ErrorResponse validateRequestParam(String userId, String movieId){
        if(userId == null)
            return new ErrorResponse("userId is null");
        if(movieId == null)
            return new ErrorResponse("movieId id is null")  ;
        return new ErrorResponse("");
    }
}
