package com.sr.region_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.region_service.entity.RegionEntity;


@Repository
public interface RegionRepository extends JpaRepository<RegionEntity, Integer>{

}