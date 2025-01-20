package com.example.watchlistms.controller;

import com.example.watchlistms.dto.ErrorResponse;
import com.example.watchlistms.dto.WatchlistRequest;
import com.example.watchlistms.dto.WatchlistResponse;
import com.example.watchlistms.service.WatchlistService;
import com.example.watchlistms.validation.WatchListValidation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie-service")
public class WatchlistController {

    private final WatchlistService watchlistService;
    WatchListValidation watchListValidation;

    public WatchlistController(WatchlistService watchlistService) {
        this.watchlistService = watchlistService;
    }

    @PostMapping("/watchlist")
    public ResponseEntity<Object> addToWatchlist(@RequestBody WatchlistRequest request) {
        ErrorResponse errorResponse = watchListValidation.validateRequestParam(request.getUserId(), request.getMovieId());
//        if(!errorResponse.getMessage().isEmpty())
//            return ResponseEntity.badRequest();

            watchlistService.addToWatchlist(request.getUserId(), request.getMovieId());


        return ResponseEntity.ok(watchlistService.addToWatchlist(request.getUserId(), request.getMovieId()));
    }
}
