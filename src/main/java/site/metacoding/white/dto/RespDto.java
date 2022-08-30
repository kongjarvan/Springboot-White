package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RespDto<T> {
	private Integer code; // -1:실패, 1:성공
	private String msg; // 통신결과를 메세지로 담기
	private T body;
	
}
