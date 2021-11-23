package com.example.findhousing.repository;

import com.example.findhousing.entity.HousingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface FindHousingRepository extends JpaRepository<HousingList, Long>, QuerydslPredicateExecutor<HousingList> {
}
