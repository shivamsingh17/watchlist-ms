package com.example.watchlistms.service;

import com.example.watchlistms.dto.WatchlistResponse;
import com.example.watchlistms.repository.WatchlistRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WatchlistService implements WatchlistServiceInterface {

    WatchlistRepository watchlistRepository;
    /*
    Function to return Waltchlist
    @param userId - String
    @param movieId - String
    @return watchlistResponse - WatchlistResponse object
     */
    public WatchlistResponse addToWatchlist(String userId, String movieId) {

        WatchlistResponse watchlistResponse = watchlistRepository.findMovie(userId, movieId);
        return watchlistResponse;
    }
}
