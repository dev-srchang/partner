package com.ywmobile.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ywmobile.domain.User;
import com.ywmobile.repository.UserRepository;

@Controller
public class UserController {
//	private List<User> users = new ArrayList<User>();

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/create")
	public String create(User user) {
		System.out.println("User : " + user.toString());
//		users.add(user);
//		return "create";
		userRepository.save(user);
		return "redirect:/users";
	}

	@GetMapping("/users")
	public String getUserList(Model model) {
//		model.addAttribute("users", users);
		model.addAttribute("users", userRepository.findAll());
		return "users";
	}
}
