package com.info;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.info.model.Login;

@Controller
public class IntercptorController {
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String empForm(Model m) {
		m.addAttribute("login", new Login());
		return "loginform";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String empLogin(Model m, Login login, HttpServletRequest req) {

		String name = (String) login.getName();
		String pass = (String) login.getPass();
		if ("123".equals(pass)) {
			req.getSession().setAttribute("user", pass);
			m.addAttribute("name", name);
			m.addAttribute("pass", pass);
			return "success";
		}

		return "loginform";
	}

}
