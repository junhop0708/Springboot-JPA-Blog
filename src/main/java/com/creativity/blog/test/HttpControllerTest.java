package com.creativity.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

	// http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest(@RequestParam int id, @RequestParam String username) {
		return "get 요청" + id + ", " + username;
	}
	
	@GetMapping("/http/get")
	public String getTest(Member member) {
		return "get 요청" + member.getId() + ", " + member.getUsername() + ", " + member.getPassword() + ", " + member.getEmail();
	}
	
	// http://localhost:8080/http/post (insert)
	@PostMapping("/http/post") // text/plain, application/json
	public String postTest(@RequestBody Member member) { // MessageConverter (스프링부트)
		return "post 요청" + member.getId() + ", " + member.getUsername() + ", " + member.getPassword() + ", " + member.getEmail();
	}
	
	// http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member member) {
		return "put 요청" + member.getId() + ", " + member.getUsername() + ", " + member.getPassword() + ", " + member.getEmail();
	}
	
	// http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
}
