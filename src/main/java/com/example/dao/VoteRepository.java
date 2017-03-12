package com.example.dao;

import com.example.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    Vote findByRestaurantIdAndUserIdAndDate(Integer restaurantId, Integer userId, java.sql.Date date);
}
