package org.person.controller;

import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IUpdatableModule.UpdateKind;
import org.person.model.PersonService;
import org.person.model.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PerController {
	
	@Autowired
	private PersonService service;
	
	//추가폼
	@RequestMapping(value = "personInsert.go",method=RequestMethod.GET)
	public String insert() {
		return "personForm";
	}
	
	//추가
	@RequestMapping(value = "personInsert.go",method=RequestMethod.POST)
	public String inert(PersonVO person) {
		service.person_insert(person);
		return "redirect:list.go";
		
	}
	
	//전체보기
	@RequestMapping(value="list.go",method=RequestMethod.GET)
	public String list(Model model) {
		List<PersonVO> userlist = service.person_list();
		model.addAttribute("personlist",userlist);
		return "personList";
		
	}
	
//	//상세보기
//	@RequestMapping("detail.go")
//	public ModelAndView detail(String id) {
//		PersonVO person = service.person_detail(id);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("user",person);
//		mv.setViewName("personView");
//		return mv;
//		
//	}
//	
//	//수정폼으로 가기
//	@RequestMapping(value="update.go",method = RequestMethod.GET)
//	public String Update(Model model,String id) {
//		PersonVO user = service.person_detail(id);
//		model.addAttribute("user",user);
//		return "updateForm";
//	}
	
	//상세보기, 수정폼
	// void는 넘어온 이름 그대로 보낸다. view.go, update.go로 보낸다.
	@RequestMapping(value = {"view.go","update.go"})
	public void view(Model model, String id) {
		PersonVO person = service.person_detail(id);
		model.addAttribute("user",person);
	}
	//수정하기
	@RequestMapping(value = "update.go",method = RequestMethod.POST)
	public String update(PersonVO person) {
		service.person_update(person);
		return "redirect:list.go";
	}
	
	
	//삭제하기
	@RequestMapping("delete.go")
	public String delete(String id) {
		service.person_delete(id);
		return "redirect:list.go";
	}

}
