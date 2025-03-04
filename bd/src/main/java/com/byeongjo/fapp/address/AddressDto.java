package com.byeongjo.fapp.address;

public class AddressDto {

	private String seq;
	private int isMain;
	private int addressCategoty;
	private String zip;
	private String address;
	private String addressBook_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getIsMain() {
		return isMain;
	}
	public void setIsMain(int isMain) {
		this.isMain = isMain;
	}
	public int getAddressCategoty() {
		return addressCategoty;
	}
	public void setAddressCategoty(int addressCategoty) {
		this.addressCategoty = addressCategoty;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(String addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
	
}
