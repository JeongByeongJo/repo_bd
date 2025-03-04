package com.byeongjo.fapp.telephone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TelephoneController {
	
	@Autowired
	TelephoneService telephoneService;
	
	@RequestMapping(value="/telephone/telephoneXdmList")
	public String telephoneXdmList(Model model) {
		model.addAttribute("list", telephoneService.selectList());
		return "telephone/telephoneXdmList";
	}
	
	@RequestMapping(value="/telephone/telephoneXdmView")
	public String telephoneXdmView(Model model, TelephoneDto telephoneDto) {
		model.addAttribute("item", telephoneService.selectOne(telephoneDto));
		return "telephone/telephoneXdmView";
	}

}
