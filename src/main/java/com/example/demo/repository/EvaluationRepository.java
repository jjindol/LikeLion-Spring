package com.example.demo.repository;

import com.example.demo.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationRepository  extends JpaRepository<Evaluation, Integer> {

    List<Evaluation> findByLectureDivideAndLectureNameContaining(String LectureDivide, String LectureName);
}
