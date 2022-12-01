package com.prospecta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prospecta.exceptions.ResourceNotFound;
import com.prospecta.model.ParaDto;
import com.prospecta.model.Parameters;
import com.prospecta.repository.ParameterRepository;
import com.prospecta.service.ParameterService;

@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParameterRepository paraRepository;

	@Override
	public Parameters createPara(Parameters parameters) {

		return paraRepository.save(parameters);
	}

	@Override
	public ParaDto getParaById(String id) {
		ParaDto dto = paraRepository.fun1(id);

		if (dto != null)
			return dto;
		else
			throw new ResourceNotFound("para not found by id :" + id);
	}

}
