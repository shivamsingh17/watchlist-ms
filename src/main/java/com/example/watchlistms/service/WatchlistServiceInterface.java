package com.example.watchlistms.service;

import com.example.watchlistms.dto.WatchlistResponse;
import org.springframework.stereotype.Service;

@Service
public interface WatchlistServiceInterface {
    public WatchlistResponse addToWatchlist(String userId, String movieId);
}
