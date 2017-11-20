package org.lpl.myDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("index.do")
	public String goIndex(Model model){
		return "index";
	}
}
