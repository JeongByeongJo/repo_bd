package com.byeongjo.fapp.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value = "/company/companyXdmList")
	public String companyXdmList(Model model) {
		model.addAttribute("list", companyService.selectList());
		return "company/companyXdmList";
	}
	
	@RequestMapping(value = "/company/companyXdmView")
	public String companyXdmView(Model model, CompanyDto companyDto) {
		model.addAttribute("item", companyService.selectOne(companyDto));
		return "company/companyXdmView";
	}
	@RequestMapping(value = "/company/companyXdmForm")
	public String companyXdmForm() {		
		return "company/companyXdmForm";
	}
	
	@RequestMapping(value = "/company/companyXdmInst")
	public String companyXdmInst(CompanyDto companyDto) {
		companyService.insert(companyDto);
		return "redirect:/company/companyXdmList";
	}
}
