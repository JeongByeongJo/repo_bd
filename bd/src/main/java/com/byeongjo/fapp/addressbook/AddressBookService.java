package com.byeongjo.fapp.addressbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {
	
	@Autowired
	AddressBookDao addressBookDao;
	
	public List<AddressBookDto> selectList() {
		return addressBookDao.selectList();
	}
	
	public AddressBookDto selectOne(AddressBookDto addressBookDto) {
		return addressBookDao.selectOne(addressBookDto);
	}
	
	public int insert(AddressBookDto addressBookDto) {
		return addressBookDao.insert(addressBookDto);
	}
	
	public int update(AddressBookDto addressBookDto) {
		return addressBookDao.update(addressBookDto);
	}
	public int delete(AddressBookDto addressBookDto) {
		return addressBookDao.delete(addressBookDto);
	}
	public int uelete(AddressBookDto addressBookDto) {
		return addressBookDao.uelete(addressBookDto);
	}

}
