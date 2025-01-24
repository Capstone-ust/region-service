package com.sr.region_service.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.region_service.entity.RegionEntity;
import com.sr.region_service.service.RegionService;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api")
public class RegionController {
	
	@Autowired
	RegionService regionService;

	
	@GetMapping("/regions")
	public ResponseEntity<List<RegionEntity>> getAllRegions(){
		return new ResponseEntity<List<RegionEntity>>(regionService.getAllRegions(),HttpStatus.OK);
	}
	@GetMapping("/regions/{rid}")
	public ResponseEntity<Optional<RegionEntity>> getAStore(@PathVariable int rid){
		return new ResponseEntity<Optional<RegionEntity>>(regionService.getARegion(rid),HttpStatus.OK);
	}
	@PostMapping("/regions")
	public ResponseEntity<RegionEntity> addStore(@RequestBody RegionEntity newRegion){
		return new ResponseEntity<RegionEntity>(regionService.addRegion(newRegion),HttpStatus.OK);
	
	}

}
