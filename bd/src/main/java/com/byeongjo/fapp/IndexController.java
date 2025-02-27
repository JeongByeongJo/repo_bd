package com.byeongjo.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

		@RequestMapping(value = "/index")
		public String index() {
			return "index";
		}

		@RequestMapping(value = "/index2")
		public String index2() {
			return "abc/index";
		}
		
		@RequestMapping(value = "/helloWorld")
		public String helloWorld() {
			return "helloWorld";
		}
				
		@RequestMapping(value = "/aaa/bbb")
		public String aaa() {
			return "bbb/aaa";
		}
		
		@RequestMapping(value = "/xxx/yyy/zzz")
		public String zzz() {
			return "yyy/zzz";
		}
		
		@RequestMapping(value = "/ttt/yyy")
		public String yyy() {
			return "zzz/yyy/xxx";
		}
		
		@RequestMapping(value = "/infra/member/loginXdmForm")
		public String loginXdmForm() {
			return "adm/v1/tmpname/infra/member/loginForm";
		}
				
		@RequestMapping(value = "infra/codegroup/codeGroupXdmList")
		public String codeGroupXdmList() {
			return "adm/v1/tmpname/infra/codegroup/codeGroupList";
		}
		
		@RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
		public String codeGroupXdmForm() {
			return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
		}
		
		@RequestMapping(value = "/infra/member/loginUsrForm")
		public String loginUsrForm() {
			return "usr/v1/tmpname/infra/member/loginForm";
		}
}
