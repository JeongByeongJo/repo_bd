package com.byeongjo.fapp.dates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatesService {
	
	@Autowired
	DatesDao datesDao;
	
	public List<DatesDto> selectList() {
		return datesDao.selectList();
	}
	
	public DatesDto selectOne(DatesDto datesDto) {
		return datesDao.selectOne(datesDto);
	}
	
	public int insert(DatesDto datesDto) {
		return datesDao.insert(datesDto);
	}
	public int update(DatesDto datesDto) {
		return datesDao.update(datesDto);
	}
	public int delete(DatesDto datesDto) {
		return datesDao.delete(datesDto);
	}
	public int uelete(DatesDto datesDto) {
		return datesDao.uelete(datesDto);
	}

}
