package com.byeongjo.fapp.commune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CommuneController {
	
	// 입력되는 주소에 매칭이 되는 html 정보를 정의, html로 데이터 전달
	
	@Autowired
	CommuneService communeService;
	
	@RequestMapping(value = "/commune/communeXdmList") 
//	public String codeGroupXdmList(Model model) {
//		List<CommuneDto> communeDtos = new ArrayList<>();
//		
//		communeDtos = communeService.selectList();
//		
//		model.addAttribute("list", communeDtos);
//		
//		return "commune/communeXdmList";
//	}

	
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", communeService.selectList());		
		return "commune/communeXdmList";
	}
	
	@RequestMapping(value = "/commune/communeXdmView") 
	public String communeXdmView(Model model, CommuneDto communeDto) {
		model.addAttribute("item", communeService.selectOne(communeDto));		
		return "commune/communeXdmView";
	}
	
	@RequestMapping(value = "/commune/communeXdmForm")
	public String communeXdmForm() {
		return "commune/communeXdmForm";
	}

	@RequestMapping(value = "/commune/communeXdmInst")
	public String communeXdmInst(CommuneDto communeDto) {
		communeService.insert(communeDto);
		return "redirect:/commune/communeXdmList";
	}
	

	@RequestMapping(value = "/commune/communeXdmMFom")
	public String communeXdmMFom(Model model, CommuneDto communeDto) {		
		model.addAttribute("item", communeService.selectOne(communeDto));
		return "commune/communeXdmMFom";
	}
	
	@RequestMapping(value = "/commune/communeXdmUpdt")
	public String communeXdmUpdt(CommuneDto communeDto) {				
		communeService.update(communeDto);
		return "redirect:/commune/communeXdmList";
	}
	
	@RequestMapping(value = "/commune/communeXdmDele")
	public String communeXdmDele(CommuneDto communeDto) {				
		communeService.delete(communeDto);
		return "redirect:/commune/communeXdmList";
	}
	
	@RequestMapping(value = "/commune/communeXdmUele")
	public String communeXdmUele(CommuneDto communeDto) {				
		communeService.uelete(communeDto);
		return "redirect:/commune/communeXdmList";
	}
}
