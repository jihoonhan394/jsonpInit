package egovframework.example.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main.do")
	public void main() {
		System.out.println("jsonp 프로젝트 메인 컨트롤러");
	}
}
