package com.byeongjo.fapp.commune;

public class CommuneDto {
	
	// int -> Integer
	// vachar -> String
	
	// DTO에서는 getter, setter 꼭 만들어야 한다.(POJO 방식)
	
	private String seq; 	// seq만 int 에서 String으로 바꾼다(성능에 큰차이 없고 나중에 필요할때가 있다.)
	private String commune;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	
}
