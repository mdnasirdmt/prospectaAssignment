package com.prospecta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.model.ParaDto;
import com.prospecta.model.Parameters;
import com.prospecta.service.ParameterService;

@RequestMapping("/api/parameters")
@RestController
public class ParaController {
	
	@Autowired
	private ParameterService parameterService;
	
	
	// create post api // http://localhost:8080/api/comments
		@PostMapping
		public ResponseEntity<Parameters> savePara(@RequestBody Parameters parameters) {

			return new ResponseEntity<Parameters>(parameterService.createPara(parameters), HttpStatus.CREATED);

		}	
		
		
		@GetMapping("/{id}")
		public ParaDto getDto(@PathVariable("id") String id) {
			
			return parameterService.getParaById(id);
		}
	

}
