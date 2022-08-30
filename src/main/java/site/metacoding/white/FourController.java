package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {

	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // DS가 four 오브젝트를 리턴받고 해당 오브젝트를 MessageConverter에게 전달 (메세지 컨퍼터의 pathing 전략은 json)
	}

	@GetMapping("/four/data")
	public ResponseEntity<Four> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
//		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.OK);
//		return response;
		return new ResponseEntity<>(four, HttpStatus.OK); // 위랑 같은거임
		// http 상태코드
		// 100번대: 응답 대기중
		// 200번대: 응답됨
		// 300번대: 리소스 변경
		// 400번대: 요청자의 잘못
		// 500번대: 응답자의 잘못
	}
	
	@GetMapping("/four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "통신성공", four);
	}

}
