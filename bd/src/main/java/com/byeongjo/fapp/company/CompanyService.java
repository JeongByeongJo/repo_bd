package com.byeongjo.fapp.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	
	@Autowired
	CompanyDao companyDao;
	
	public List<CompanyDto> selectList() {
		return companyDao.selectList();
	}
	
	public CompanyDto selectOne(CompanyDto companyDto) {
		return companyDao.selectOne(companyDto);
	}
	
	public int insert(CompanyDto companyDto) {
		return companyDao.insert(companyDto);				
	}
	public int update(CompanyDto companyDto) {
		return companyDao.update(companyDto);				
	}

}
