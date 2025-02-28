package com.byeongjo.fapp.commune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
