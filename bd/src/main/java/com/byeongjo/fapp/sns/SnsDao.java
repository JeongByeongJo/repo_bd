package com.byeongjo.fapp.sns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SnsDao {
	
	public List<SnsDto> selectList();
	
	public SnsDto selectOne(SnsDto snsDto);
	
	public int insert(SnsDto snsDto);

}
