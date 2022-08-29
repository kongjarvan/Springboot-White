package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기
// GET -> http 바디가 없음 -> 쿼리스트링, 패스(PK) -> Form(Get) -> 브라우저 (주소 뒤에 ? 붙이기)
// POST PUT -> http body 담아줌 -> Form (POST) -> JS
// DELETE -> http 바디가 없음 -> 쿼리스트링, 패스(PK)
// pk는 패스, pk가 아니면 쿼리스트링으로 get

@RestController
public class SecondController {

	@GetMapping("/second/{id}") // pk(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id: " + id;
	}
	
	// 쿼리스트링 = x-www-form뭐시기 타입
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title: " + title + ", content: " + content;
	}
	
	@PostMapping("/second")
	public String postData(String title, String content) { // 스프링 파싱 기본 전략 : x-www-어쩌구
		return "title: " + title + ", content: " + content;
	}
	
	
	@PutMapping("/second")
	public String putdata(String title, String content) {
		return "title: " + title + ", content: " + content;
	}
	
	
	@DeleteMapping("/second/{id}")
	public String deletedata(@PathVariable Integer id) {
		return id + " delete ok";
	}
	
}
