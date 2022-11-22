package com.test.controller;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.test.Entity.Member;
import com.test.dto.MemberFormDto;
import com.test.service.MemberService;
import com.test.service.PostsService;

import lombok.RequiredArgsConstructor;
import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver;

@RequiredArgsConstructor
@Controller
public class MainController {

	public final PostsService postsService;	
	
	@GetMapping("/")
	public String index(Model model, Principal principal) {
		model.addAttribute("posts",postsService.findAllDesc());
		if(principal != null) {
			model.addAttribute("name",principal.getName());
		}
		return "index";
	}
}
