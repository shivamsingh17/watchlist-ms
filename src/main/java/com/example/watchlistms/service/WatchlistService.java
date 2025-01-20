package com.example.watchlistms.service;

import com.example.watchlistms.dto.WatchlistResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WatchlistService implements WatchlistServiceInterface {

//    WatchlistRepository watchlistRepository;
    /*
    Function to return Waltchlist
    @param userId - String
    @param movieId - String
    @return watchlistResponse - WatchlistResponse object
     */
    public WatchlistResponse addToWatchlist(String userId, String movieId) {

//        WatchlistResponse watchlistResponse = watchlistRepository.findMovie(userId, movieId);
        WebClient webClient = WebClient.builder()
                .baseUrl("http://34.148.175.45:8080/api-gateway/movie-service")
                .build();

        return webClient.get()
                .uri("//movie/{id}", movieId)
                .header(HttpHeaders.AUTHORIZATION, "X-API-Key: movie-service6cda51ffd6384878af98797672977a0f")
                .retrieve()
                .bodyToMono(Product[].class);

    }
}
