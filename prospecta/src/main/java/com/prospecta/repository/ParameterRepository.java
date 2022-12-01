package com.prospecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prospecta.model.ParaDto;
import com.prospecta.model.Parameters;

public interface ParameterRepository extends JpaRepository<Parameters, String> {

	@Query("select new com.prospecta.model.ParaDto(t.id,t.title) from Parameters t where t.id=?1")
	public ParaDto fun1(String id);

}
