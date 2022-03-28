package com.id.card;

public class Card {
	private String name;
	private String email;
	private String cardName;
	private String CardNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isEmpty()||name.isBlank()) {
			System.out.println("Invalid Name");
		}
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email==null||!email.contains("@gmail.com")){
			System.out.println("Invalid Email");
		}
		this.email = email;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		if(cardName==null) {
			System.out.println("Invalid cardName");
		}
		this.cardName = cardName;
	}
	public String getCardNum() {
		return CardNum;
	}
	public void setCardNum(String cardNum) {
		if(cardNum==null) {
			System.out.println("Invalid cardName");
		}
		this.CardNum = cardNum;
	}
	
	

}
