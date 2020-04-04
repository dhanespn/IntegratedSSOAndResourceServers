package org.techforumist.google.oauth.web;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@RequestMapping("/user")
	public Principal sayHello(Principal principal,HttpServletRequest request) {
		if(principal == null) {
			//principal = request.get();
			return principal;
		} 
		return principal;
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
			//principal = request.get();
		Authentication h = SecurityContextHolder.getContext().getAuthentication();
			return "Hi";
	}

}
