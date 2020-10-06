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
	
	//�߰���
	@RequestMapping(value="personInsert.go",method=RequestMethod.GET) //"personForm"�� �Ȱ��� �̸��� ����ҷ��� void�� ����ص� �ȴ�.
	public String insert() {
		return "personForm";
	}
	
	//�߰�
	@RequestMapping(value="personInsert.go",method=RequestMethod.POST)
	public String insert(Person p) {
		dao.perInsert(p);
		return "redirect:list.go";
	}
	
	//��ü����
	@RequestMapping("list.go")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<Person> userlist = dao.perList();
		mv.addObject("userlist",userlist); //userlist�� �����Ѵ�.�����ϰ� �ѷ�����Ѵ�.
		mv.setViewName("personList");
		dao.perList();
		return mv;
	}
	
	//�󼼺���
	@RequestMapping("view.go")
	public ModelAndView view(String id) {
		Person person = dao.perView(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",person);
		mv.setViewName("personView");
		return mv;
	}
	
	//���������� ���� -> update.go
	@RequestMapping(value="update.go",method=RequestMethod.GET)//���� �̸��� ������ ����Ѵ�.
	public String update(Model model, String id) {
		Person user = dao.perView(id);
		model.addAttribute("user",user);
		return "updateForm";
	}
	
	//�����ϱ�
	@RequestMapping(value="update.go",method=RequestMethod.POST)
	public String update(Person p) {
		dao.perUpdate(p);
		return "redirect:list.go";
	}
	
	//�����ϱ�
	@RequestMapping("delete.go")
	public String delete(String id) {
		dao.perDelete(id);
		return "redirect:list.go";
	}
	

}
