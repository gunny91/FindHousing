package com.example.findhousing.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HousingList extends MainEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SEQ_NO;

    @Column(length = 100, nullable = false)
    private String MEMO_TITLE;

    @Column(length = 1500, nullable = false)
    private String MEMO_CONTENT;

    @Column(length = 50, nullable = false)
    private String MEMO_AUTHOR;

}
