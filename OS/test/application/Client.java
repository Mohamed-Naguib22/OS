/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

public class Client {
	private String accId;
	private String cardnum;
	private String cvc;
	private Integer currentBalance;
	private String ssn;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String Address;
	
	public Client (String accId, String cardnum, String cvc, int currentBalance, String ssn, String firstName, String lastName, String phoneNum, String Address) {
		this.setAccId(accId);
		this.setCardnum(cardnum);
		this.setCvc(cvc);
		this.setCurrentBalance(currentBalance);
		this.setSsn(ssn);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNum(phoneNum);
		this.setAddress(Address);
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public Integer getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Integer currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}