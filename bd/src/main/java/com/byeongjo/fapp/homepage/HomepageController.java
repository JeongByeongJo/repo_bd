package com.byeongjo.fapp.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomepageController {
	
	@Autowired
	HomepageService homepageService;
	
	@RequestMapping(value="/homepage/homepageXdmList")
	public String homepageXdmList(Model model) {
		model.addAttribute("list", homepageService.selectList());
		return "homepage/homepageXdmList";
	}
	
	@RequestMapping(value="/homepage/homepageXdmView")
	public String homepageXdmView(Model model, HomepageDto homepageDto) {
		model.addAttribute("item", homepageService.selectOne(homepageDto));
		return "homepage/homepageXdmView";
	}
	@RequestMapping(value="/homepage/homepageXdmForm")
	public String homepageXdmForm() {
		return "homepage/homepageXdmForm";
	}
	@RequestMapping(value="/homepage/homepageXdmInst")
	public String homepageXdmInst(HomepageDto homepageDto) {
		homepageService.insert(homepageDto);
		return "redirect:/homepage/homepageXdmList";
	}

	@RequestMapping(value="/homepage/homepageXdmMfom")
	public String homepageXdmMfom(Model model, HomepageDto homepageDto) {
		model.addAttribute("item", homepageService.selectOne(homepageDto));
		return "homepage/homepageXdmMfom";
	}
	
	@RequestMapping(value="/homepage/homepageXdmUpdt")
	public String homepageXdmUpdt(HomepageDto homepageDto) {
		homepageService.update(homepageDto);
		return "redirect:/homepage/homepageXdmList";
	}
	
	@RequestMapping(value="/homepage/homepageXdmDele")
	public String homepageXdmDele(HomepageDto homepageDto) {
		homepageService.delete(homepageDto);
		return "redirect:/homepage/homepageXdmList";
	}
	
	@RequestMapping(value="/homepage/homepageXdmUele")
	public String homepageXdmUele(HomepageDto homepageDto) {
		homepageService.uelete(homepageDto);
		return "redirect:/homepage/homepageXdmList";
	}
}
