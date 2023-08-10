package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;


@Data
@Entity
@Builder
@Table(name = "evaluation")
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eva_id;

    @Column(length = 30)
    private String user_id;

    @Column(length = 50)
    private String lectureName;

    @Column(length = 20)
    private String professorName;
    private int lectureYear ;
    @Column(length = 10)
    private String semesterDivide ;
    @Column(length = 20)
    private String lectureDivide; // 강의 구분 (전체, 전공, 교양 등의 값이 들어감)
    @Column(length = 50)
    private String evaluationTitle;
    @Column(length = 300)
    private String evaluationContent;
    @Column(length = 2)
    private String creditScore;
    @Column(length = 2)
    private String lectureScore;
    @Builder.Default
    private int likeCount=0;


}