package com.byeongjo.fapp.telephone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelephoneService {
	
	@Autowired
	TelephoneDao telephoneDao;
	
	public List<TelephoneDto> selectList() {
		return telephoneDao.selectList();
	}
	
	public TelephoneDto selectOne(TelephoneDto telephoneDto) {
		return telephoneDao.selectOne(telephoneDto);
	}

	public int insert(TelephoneDto telephoneDto) {
		return telephoneDao.insert(telephoneDto);
	}
	public int update(TelephoneDto telephoneDto) {
		return telephoneDao.update(telephoneDto);
	}
	public int delete(TelephoneDto telephoneDto) {
		return telephoneDao.delete(telephoneDto);
	}
	public int uelete(TelephoneDto telephoneDto) {
		return telephoneDao.uelete(telephoneDto);
	}
}
