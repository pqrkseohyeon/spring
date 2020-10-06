package com.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.person.model.PerDAOImpl;
import com.person.model.Person;

@Controller
public class PersonController {
	
	@Autowired 
	private PerDAOImpl dao;
	
	//추가폼
	@RequestMapping(value="personInsert.go",method=RequestMethod.GET) //"personForm"과 똑같은 이름을 사용할려면 void를 사용해도 된다.
	public String insert() {
		return "personForm";
	}
	
	//추가
	@RequestMapping(value="personInsert.go",method=RequestMethod.POST)
	public String insert(Person p) {
		dao.perInsert(p);
		return "redirect:list.go";
	}
	
	//전체보기
	@RequestMapping("list.go")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<Person> userlist = dao.perList();
		mv.addObject("userlist",userlist); //userlist로 저장한다.저장하고 뿌려줘야한다.
		mv.setViewName("personList");
		dao.perList();
		return mv;
	}
	
	//상세보기
	@RequestMapping("view.go")
	public ModelAndView view(String id) {
		Person person = dao.perView(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",person);
		mv.setViewName("personView");
		return mv;
	}
	
	//수정폼으로 가기 -> update.go
	@RequestMapping(value="update.go",method=RequestMethod.GET)//같은 이름을 쓸려고 사용한다.
	public String update(Model model, String id) {
		Person user = dao.perView(id);
		model.addAttribute("user",user);
		return "updateForm";
	}
	
	//수정하기
	@RequestMapping(value="update.go",method=RequestMethod.POST)
	public String update(Person p) {
		dao.perUpdate(p);
		return "redirect:list.go";
	}
	
	//삭제하기
	@RequestMapping("delete.go")
	public String delete(String id) {
		dao.perDelete(id);
		return "redirect:list.go";
	}
	

}
