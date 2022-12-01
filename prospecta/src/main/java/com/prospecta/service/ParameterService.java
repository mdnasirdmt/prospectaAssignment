package com.prospecta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prospecta.model.ParaDto;
import com.prospecta.model.Parameters;

public interface ParameterService {

	public Parameters createPara(Parameters parameters);

	public ParaDto getParaById(String id);

}
