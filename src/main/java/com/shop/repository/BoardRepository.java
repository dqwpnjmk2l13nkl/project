package com.shop.repository;

import com.shop.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
   List<Board> findAllByOrderByUpdateTimeDesc();

}
