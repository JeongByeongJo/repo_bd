package com.byeongjo.fapp.telephone;

public class TelephoneDto {
	
	private String seq;
	private String isMain;
	private String telCategory;
	private String telNum;
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
	public String getTelCategory() {
		return telCategory;
	}
	public void setTelCategory(String telCategory) {
		this.telCategory = telCategory;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(String addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
	

}
