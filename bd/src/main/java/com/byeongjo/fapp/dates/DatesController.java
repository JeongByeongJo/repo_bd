package com.byeongjo.fapp.dates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DatesController {
	
	@Autowired
	DatesService datesService;
	
	@RequestMapping(value="/dates/datesXdmList")
	public String datesXdmList(Model model) {
		model.addAttribute("list", datesService.selectList());
		return "dates/datesXdmList";
	}
	
	@RequestMapping(value="/dates/datesXdmView")
	public String datesXdmView(Model model, DatesDto datesDto) {
		model.addAttribute("item", datesService.selectOne(datesDto));
		return "dates/datesXdmView";
	}

}
