package com.byeongjo.fapp.company;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {

	public List<CompanyDto> selectList();
	
	public CompanyDto selectOne(CompanyDto companyDto);
	
	public int insert(CompanyDto companyDto);
	public int update(CompanyDto companyDto);
	public int delete(CompanyDto companyDto);
	public int uelete(CompanyDto companyDto);
}
