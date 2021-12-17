package com.projectcom.projectapp.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projectcom.projectapp.board.BoardVO;
import com.projectcom.projectapp.board.UserVO;
import com.projectcom.projectapp.user.UserServiceImpl;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	UserServiceImpl service;
	
	@RequestMapping(value="/signin", method= RequestMethod.GET)
	public String singin() {
		return "signin";
	}
	@RequestMapping(value = "/signok", method = RequestMethod.POST)
	public String signOK(UserVO vo) {
		int i = service.insertUser(vo);
		if(i == 0)
			System.out.println("데이터 추가 실패!");
		else
			System.out.println("데이터 추가 성공!");
		return "redirect:login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String login(String t, Model model) {
		return "login";
	}
	
	@RequestMapping(value="/loginOk", method= RequestMethod.POST)
	public String loginCheck(HttpSession session, UserVO vo) {
		String returnURL = "";
		if(session.getAttribute("login") != null) {
			session.removeAttribute("login");
			
		}
		
		UserVO loginvo = service.getUser(vo);
		if(loginvo != null) { //로그인 성공적으로 했다는 뜻
			System.out.println("로그인 성공!");
				session.setAttribute("login", loginvo);
				returnURL = "redirect:/board/list"; // 로그인 실패했다는 뜻			
		}else {
			System.out.println("로그인 실패!!!");
				returnURL = "redirect:/login/login"; // 로그인 실패했다는 뜻
		}
		return returnURL;
	}
	
	//로그아웃 하는 부분
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("로그아웃");
		return "redirect:/login/login";
	}

}