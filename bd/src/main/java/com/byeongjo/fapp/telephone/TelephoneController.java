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
	
	@RequestMapping(value="/telephone/telephoneXdmForm")
	public String telephoneXdmForm() {
		return "telephone/telephoneXdmForm";
	}
	
	@RequestMapping(value="/telephone/telephoneXdmInst")
	public String telephoneXdmInst(TelephoneDto telephoneDto) {
		telephoneService.insert(telephoneDto);
		return "redirect:/telephone/telephoneXdmList";
	}
	
	@RequestMapping(value="/telephone/telephoneXdmMfom")
	public String telephoneXdmMfom(Model model, TelephoneDto telephoneDto) {
		model.addAttribute("item", telephoneService.selectOne(telephoneDto));
		return "telephone/telephoneXdmMfom";
	}
	
	@RequestMapping(value="/telephone/telephoneXdmUpdt")
	public String telephoneXdmUpdt(TelephoneDto telephoneDto) {
		telephoneService.update(telephoneDto);
		return "redirect:/telephone/telephoneXdmList";
	}

}
