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
	
	@RequestMapping(value="/dates/datesXdmForm")
	public String datesXdmForm() {
		return "dates/datesXdmForm";
	}
	
	@RequestMapping(value="/dates/datesXdmInst")
	public String datesXdmInst(DatesDto datesDto) {
		datesService.insert(datesDto);
		return "redirect:/dates/datesXdmList";
	}
	
	@RequestMapping(value="/dates/datesXdmMfom")
	public String datesXdmMfom(Model model, DatesDto datesDto) {
		model.addAttribute("item", datesService.selectOne(datesDto));
		return "dates/datesXdmMfom";
	}
	
	@RequestMapping(value="/dates/datesXdmUpdt")
	public String datesXdmUpdt(DatesDto datesDto) {
		datesService.update(datesDto);
		return "redirect:/dates/datesXdmList";
	}

}
