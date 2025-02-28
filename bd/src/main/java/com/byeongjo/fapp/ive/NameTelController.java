package com.byeongjo.fapp.ive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameTelController {
	
	@Autowired
	NameTelService nameTelService;
	
	@RequestMapping(value = "/nametell/nametellXdmList")
	public String nametellXdmList(Model model) {
		model.addAttribute("list", nameTelService.selectList());
		return "nametell/nametellXdmList";
	}

}
