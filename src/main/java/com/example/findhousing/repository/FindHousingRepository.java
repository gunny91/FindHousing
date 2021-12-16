package com.example.findhousing.repository;

import com.example.findhousing.entity.HousingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FindHousingRepository extends JpaRepository<HousingList, Long> {
}
