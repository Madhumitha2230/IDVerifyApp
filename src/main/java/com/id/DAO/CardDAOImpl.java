package com.id.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.id.card.CardDetails;
import com.id.regLogin.ConnectionUtil;

public class CardDAOImpl {
	
	public void addCard(CardDetails carddetails) throws Exception{
	Connection connection=null;
	connection=ConnectionUtil.getConnection();
	
	    String sql="INSERT INTO usercard(NAME,email,cardName,CardNum) VALUE(?,?,?,?)";
	    PreparedStatement statement=connection.prepareStatement(sql);
	    statement.setString(1,carddetails.getName());
	    statement.setString(2,carddetails.getEmail());
	    statement.setString(3,carddetails.getCardName());
	    statement.setString(4,carddetails.getCardNum());
	  
	
	    int rows=statement.executeUpdate();
	    if(rows==1) {
	    	System.out.println("Card Added successfully");
	    }
	    else {
	    	System.out.println("Card Not Added");
	    }

}
}