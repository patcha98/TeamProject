package com.projectcom.projectapp.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", boardService.getBoardList());
		return "list";
	}
	
	
	@RequestMapping(value = "/board/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	
	@RequestMapping(value = "/board/addok", method = RequestMethod.POST)
	public String addPostOK(BoardVO vo) {
		int i = boardService.insertBoard(vo);
		if(i == 0)
			System.out.println("데이터 추가 실패!");
		else
			System.out.println("데이터 추가 성공!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/board/editok", method = RequestMethod.POST)
	public String editPostOK(BoardVO vo) {
		int i = boardService.updateBoard(vo);
		if(i == 0)
			System.out.println("데이터 추가 실패!");
		else
			System.out.println("데이터 추가 성공!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/board/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		BoardVO boardVO = boardService.getBoard(id);
		model.addAttribute("boardVO", boardVO);
		return "editform";
	}
	
	@RequestMapping(value = "board/deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id") int id) {
		int i = boardService.deleteBoard(id);
		if(i == 0)
			System.out.println("데이터 추가 실패!");
		else
			System.out.println("데이터 추가 성공!");
		return "redirect:../list";
	}
	
	@RequestMapping(value = "/board/gradeBoard/1", method = RequestMethod.GET)
	public String gradeBoard1(Model model) {
		model.addAttribute("list", boardService.getGrade1BoardList());
		return "grade1";
	}
	@RequestMapping(value = "/board/gradeBoard/2", method = RequestMethod.GET)
	public String gradeBoard2(Model model) {
		model.addAttribute("list", boardService.getGrade2BoardList());
		return "grade2";
	}
	@RequestMapping(value = "/board/gradeBoard/3", method = RequestMethod.GET)
	public String gradeBoard3(Model model) {
		model.addAttribute("list", boardService.getGrade3BoardList());
		return "grade3";
	}
	@RequestMapping(value = "/board/gradeBoard/4", method = RequestMethod.GET)
	public String gradeBoard4(Model model) {
		model.addAttribute("list", boardService.getGrade4BoardList());
		return "grade4";
	}
}

