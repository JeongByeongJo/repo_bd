package com.byeongjo.fapp.ive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameTelService {
	
	@Autowired
	NameTelDao nameTelDao;
	
	public List<NameTelDto> selectList() {
		return nameTelDao.selectList();
	}

}
