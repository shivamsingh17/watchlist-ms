package com.example.watchlistms.repository;

import com.example.watchlistms.dto.MovieResponse;
import com.example.watchlistms.dto.WatchlistResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends JpaRepository<MovieResponse, String> {

    @Query(value = "select message, movie_name, year, genre, overview where userId = :userId and movieID = :movieID", nativeQuery = true)
    WatchlistResponse findMovie(@Param("userId") String userID, @Param("movieID") String movieId);


}
