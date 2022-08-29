package site.metacoding.white;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;


// 고급 body 데이터 받기 (json, x-www-어쩌구, text)

@RestController
public class ThirdController {
	
	
	@PostMapping("/third")
	public String postData(Third third) { // DTO(데이터 트랜스퍼 오브젝트)
		return "id: " + third.getId() + ", title: " + third.getTitle() + ", content: " + third.getContent(); 
	}
	
	
	// UPDATE third SET title = ?, content = ? WHERE id = ?
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id, @RequestBody Third third) {
		// requestbody: json으로 데이터를 받을때 사용
		return third.toString();
	}
	
	
}
