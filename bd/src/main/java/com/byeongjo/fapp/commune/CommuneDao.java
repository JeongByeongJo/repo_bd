package com.byeongjo.fapp.commune;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CommuneDao {
	
	// Mapper에서 해당하는 쿼리와 연결시켜주고 쿼리 결과를 가져옴
	public List<CommuneDto> selectList();  // <- 추상메서드(내용이없다.)
	

}
