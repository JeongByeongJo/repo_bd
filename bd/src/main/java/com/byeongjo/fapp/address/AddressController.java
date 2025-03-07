package com.byeongjo.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value = "/address/addressXdmList")
	public String addressXdmList(Model model) {
		model.addAttribute("list", addressService.selectList());
		return "address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmView")
	public String addressXdmOne(Model model, AddressDto addressDto) {
		model.addAttribute("item", addressService.selectOne(addressDto));
		return "address/addressXdmView";
	}

	@RequestMapping(value = "/address/addressXdmForm")
	public String addressXdmForm() {		
		return "address/addressXdmForm";
	}
	
	@RequestMapping(value = "/address/addressXdmInst")
	public String addressXdmInst(AddressDto addressDto) {
		addressService.insert(addressDto);
		return "redirect:/address/addressXdmList";
	}
	@RequestMapping(value = "/address/addressXdmMfom")
	public String addressXdmMfom(Model model, AddressDto addressDto) {
		model.addAttribute("item", addressService.selectOne(addressDto));
		return "address/addressXdmMfom";
	}
	
	@RequestMapping(value = "/address/addressXdmUpdt")
	public String addressXdmUpdt(AddressDto addressDto) {
		addressService.update(addressDto);
		return "redirect:/address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmDele")
	public String addressXdmDele(AddressDto addressDto) {
		addressService.delete(addressDto);
		return "redirect:/address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmUele")
	public String addressXdmUele(AddressDto addressDto) {
		addressService.uelete(addressDto);
		return "redirect:/address/addressXdmList";
	}
}
