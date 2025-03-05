package com.byeongjo.fapp.commune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommuneService {

	// 로직을 정의하는 부분 (1.하나가져오기 2.여러개가져오기 3.삽입 4.업데이트 5.삭제)
	// 여러건의 데이터를 가지고 온다.(여러개 가져올때 selectList 쓴다/1개 가져올땐 selectOne)
	
	@Autowired
	CommuneDao communeDao;
	
//	public List<CommuneDto> selectList() {
//		List<CommuneDto> communeDtos = new ArrayList<>();
//		communeDtos = communeDao.selectList();
//		
//		return communeDtos;
//	}
	
	public List<CommuneDto> selectList() {
		return communeDao.selectList();
	}
	
	public CommuneDto selectOne(CommuneDto communeDto) {
		return communeDao.selectOne(communeDto);
	}
	
	public int insert(CommuneDto communeDto) {
		return communeDao.insert(communeDto);
	}
}
