package kr.ac.hansung.web.gyumin.subjectmanager.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.web.gyumin.subjectmanager.model.Register;
import kr.ac.hansung.web.gyumin.subjectmanager.service.RegisterService;

@Controller
public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private RegisterService registerService;
	
	/*
	 * register table 출력
	 */
	@RequestMapping(value = "/register")
	public String Register(Model model) {
//		List<Register> registerList = registerService.getRegisterList();
//		
//		model.addAttribute("registerList", registerList);

		return "registerCourseForm";
	}
	
	@RequestMapping("/registerList")
	public String showRegister(Model model) {
		List<Register> registerList = registerService.getRegisterList();
		
		model.addAttribute("registerList", registerList);

		return "registerListForm";
	}
	
	/*
	 * 수강신청 수행
	 */
	@RequestMapping(value = "/doregister")
	public String doRegister(Model model, Register register) {
		registerService.insert(register);
		return "registercreated";
	}
}
