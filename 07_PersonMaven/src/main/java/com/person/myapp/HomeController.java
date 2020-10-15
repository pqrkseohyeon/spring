package com.person.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.person.model.PersonDTO;
import com.person.model.PersonService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private PersonService pService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "redirect:list";
	}
	
	//추가폼
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public void insert() {
		
	}
	
	//추가하기
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(PersonDTO person) {
		pService.Insert(person);
		return "redirect:list";
	}
	
	//전체보기
	@RequestMapping("list")
	public void list(Model model,String field, String word) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("field", field);
		hm.put("word", word);
		List<PersonDTO> userlist = pService.findAll(hm);
		model.addAttribute("userlist",userlist);
		
		//전제 회원 수 
		int count = pService.count();
		model.addAttribute("count",count);
	}
	
	//상세보기, 수정폼
	@RequestMapping(value = {"view","update"})
	public void view(Model model, String id) {
		PersonDTO person = pService.findById(id);
		model.addAttribute("user",person);
	}
	
	//수정하기
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(PersonDTO person) {
		pService.Update(person);
		return "redirect:list";
	}
	
	//삭제하기
	@RequestMapping("delete")
	public String delte(String id) {
		pService.Delete(id);
		return "redirect:list";
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
