package com.ywmobile.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywmobile.domain.User;
import com.ywmobile.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	// users로 post method로 들어오면 파트너사 추가
	// TODO : 가입과 동시에 자동 로그인 되게 해야함
	@PostMapping("")
	public String create(User user) {
		System.out.println("user : " + user.toString());
		userRepository.save(user);

		return "redirect:/users";
	}

	// users로 get method로 들어오면 파트너사 목록 페이지
	@GetMapping("")
	public String getUserList(Model model) {
		model.addAttribute("users", userRepository.findAll());

		return "/user/list";
	}
}
