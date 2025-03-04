package com.byeongjo.fapp.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddressBookController {
	
	@Autowired
	AddressBookService addressBookService;
	
	@RequestMapping(value = "/addressbook/addressbookXdmList")
	public String addressbookXdmList(Model model) {
		model.addAttribute("list", addressBookService.selectList());
		return "addressbook/addressbookXdmList";
	}
	
	@RequestMapping(value = "/addressbook/addressbookXdmView")
	public String addressbookXdmView(Model model, AddressBookDto addressBookDto) {
		model.addAttribute("item", addressBookService.selectOne(addressBookDto));
		return "addressbook/addressbookXdmView";
	}

}
