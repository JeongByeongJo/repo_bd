package com.byeongjo.fapp.dates;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DatesDao {
	
	public List<DatesDto> selectList();
	
	public DatesDto selectOne(DatesDto datesDto);
	
	public int insert(DatesDto datesDto);
	public int update(DatesDto datesDto);
	public int delete(DatesDto datesDto);
	public int uelete(DatesDto datesDto);

}
