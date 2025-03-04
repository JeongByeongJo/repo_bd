package com.byeongjo.fapp.company;

public class CompanyDto {
	
	private String seq;
    private int isMain;
    private String company;
    private String department;
    private String positions;
    private String addressBook_seq;
//    -----
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPositions() {
		return positions;
	}
	public void setPositions(String positions) {
		this.positions = positions;
	}
	public String getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(String addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
    

}
