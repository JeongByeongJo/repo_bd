package com.byeongjo.fapp.ive;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NameTelDao {
	
	public List<NameTelDto> selectList();

}
