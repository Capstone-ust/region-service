package com.sr.region_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.region_service.dao.RegionRepository;
import com.sr.region_service.entity.RegionEntity;

@Service
public class RegionService {
	
	@Autowired
	RegionRepository regionRepo;
	
		public List<RegionEntity> getAllRegions(){
				
				return regionRepo.findAll();
				
			}
		public Optional<RegionEntity> getARegion(int regionId) {
			return regionRepo.findById(regionId);
		}
		
		public RegionEntity addRegion(RegionEntity newRegion) {
			return regionRepo.saveAndFlush(newRegion);
		}

}
