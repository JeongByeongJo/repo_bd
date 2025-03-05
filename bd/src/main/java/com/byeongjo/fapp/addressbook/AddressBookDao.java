package com.byeongjo.fapp.addressbook;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookDao {
	
	public List<AddressBookDto> selectList();	
	public AddressBookDto selectOne(AddressBookDto addressBookDto);
	public int insert(AddressBookDto addressBookDto);

}
