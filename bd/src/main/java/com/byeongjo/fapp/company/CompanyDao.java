package com.byeongjo.fapp.company;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {

	public List<CompanyDto> selectList();
	
	public CompanyDto selectOne(CompanyDto companyDto);
}
