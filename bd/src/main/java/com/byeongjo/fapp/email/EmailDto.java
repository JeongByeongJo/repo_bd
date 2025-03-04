package com.byeongjo.fapp.email;

public class EmailDto {
	
	private String seq;
	private String isMain;
	private String email;
	private String addressBook_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getIsMain() {
		return isMain;
	}
	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(String addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
	

}
