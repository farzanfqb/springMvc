package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.service.AddService;

@Controller
public class AddController {
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2){
		ModelAndView mv = new ModelAndView();
		AddService as = new AddService();
		mv.addObject("result",as.add(num1, num2) );
		mv.setViewName("result.jsp");
		return mv;
	}
	

}
