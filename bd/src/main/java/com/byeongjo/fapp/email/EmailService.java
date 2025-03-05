package com.byeongjo.fapp.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	EmailDao emailDao;
	
	public List<EmailDto> selectList() {
		return emailDao.selectList();
	}
	
	public EmailDto selectOne(EmailDto emailDto) {
		return emailDao.selectOne(emailDto);
	}

	public int insert(EmailDto emailDto) {
		return emailDao.insert(emailDto);
	}
}
