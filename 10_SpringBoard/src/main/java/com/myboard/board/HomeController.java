package com.myboard.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myboard.dto.BoardDTO;
import com.myboard.model.BoardListDTO;
import com.myboard.model.BoardService;
import com.myboard.model.PageAction;
import com.myboard.util.SearchDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private BoardService service;
	
	@Autowired
	private PageAction page;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "redirect:list";
	}
	
	//�߰��ϱ�
	@PostMapping("boardInsert")
	public String insert(BoardDTO board) {
		service.insert(board);
		return "redirect:boardList";
	}
	
	//��ü����
	@GetMapping("list")
	public String list(Model model,SearchDTO sdto) {
		int count = service.getCount(sdto);
		List<BoardDTO> list = service.findAll(sdto);
		
		int rowNo = count-((sdto.getPageNum()-1)*10);
		model.addAttribute("count",count);
		model.addAttribute("rowNo",rowNo);
		model.addAttribute("listResult",list);
		
		return "list";

	}
	@GetMapping("get/{num}")
	public void get(@PathVariable("num") int num,Model model) {
		//System.out.println("num :"+num);
		BoardDTO board = service.findByNum(num);
		model.addAttribute("board",board);
	}
	@GetMapping("view")
	public void view(int num,Model model) {
		//System.out.println("num :"+num);
		BoardDTO board = service.findByNum(num);
		model.addAttribute("board",board);
	}
	
//	//�󼼺���
//	@GetMapping("boardView")
//	@ResponseBody
//	public BoardDTO view(int num) {
//		BoardDTO board=service.findByNum(num);
//		return board;
//	}
//	
//	//�����ϱ�
//	@GetMapping("boardDelete")
//	@ResponseBody
//	public String delete(int num) {
//		service.delete(num);
//		return "success";
//	}
//	
}
