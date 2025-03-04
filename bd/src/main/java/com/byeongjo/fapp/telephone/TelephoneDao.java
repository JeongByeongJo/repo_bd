package com.byeongjo.fapp.telephone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneDao {
	
	public List<TelephoneDto> selectList();
	
	public TelephoneDto selectOne(TelephoneDto telephoneDto);

}
