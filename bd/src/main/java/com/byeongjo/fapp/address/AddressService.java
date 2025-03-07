package com.byeongjo.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public List<AddressDto> selectList() {
		return addressDao.selectList();		
	}

	public AddressDto selectOne(AddressDto addressDto) {
		return addressDao.selectOne(addressDto);		
	}
	
	public int insert(AddressDto addressDto) {
		return addressDao.insert(addressDto);
	}
	public int update(AddressDto addressDto) {
		return addressDao.update(addressDto);
	}
	public int delete(AddressDto addressDto) {
		return addressDao.delete(addressDto);
	}
	public int uelete(AddressDto addressDto) {
		return addressDao.uelete(addressDto);
	}

}
