package com.ywmobile.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/join")
	public String join() {
		return "join";
	}
}
