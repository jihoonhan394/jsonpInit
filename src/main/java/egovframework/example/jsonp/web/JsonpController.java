package egovframework.example.jsonp.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsonpController {
	
	@RequestMapping("/search.do")
	public void jsonp(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("jsonp");
		
		String id = request.getParameter("id");
		
		System.out.println("###id " + id);
		
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		if ("hanq".equals(id)) {
			out.write("myCallback({\"name\" : \"hanq\"})");
		} else {
			out.write("myCallback({\"name\" : \"noHanq\"})");
		}
	}

}
