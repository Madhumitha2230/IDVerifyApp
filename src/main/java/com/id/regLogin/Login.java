package com.id.regLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.id.card.ApplyDocuments;
import com.id.card.UploadDocuments;
public class Login {
	
	public static void login()throws Exception{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the email");
		String email=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		
		Connection connection=null;
		 PreparedStatement statement=null;
		connection=ConnectionUtil.getConnection();
		
		String query="SELECT email,PASSWORD FROM regLogin WHERE email=?";
		
		statement=connection.prepareStatement(query);
		statement.setString(1, email);
		
		ResultSet rs=statement.executeQuery();
		 String userMail=null;
		 String userPassword=null;
		
		 while (rs.next()) {
			
		 	 userMail=rs.getString("email");
			 userPassword=rs.getString("password");
			 if (userMail == null) {
					System.err.println("No records found - please register");
				} else if (userPassword.equals(password)) {
					System.out.println("(:Welcome to ID Verification App:)");
					//TicketBooking.allMovies();
					System.out.println("Please select any one of the option");
					System.out.println("1.Upload Documents");
					System.out.println("2.Apply Documents");
					System.out.println("3.Retrieve your Data");
					Scanner sc1=new Scanner(System.in);
					int b=sc1.nextInt();
					
					if(b==1) {
						System.out.println("please upload your documents");
						UploadDocuments.aadhar();
						UploadDocuments.panCard();
						UploadDocuments.drivingLicence();
					}
					else if (b==2) {
						System.out.println("please select the card to apply ");
						System.out.println("1.pan card");
						System.out.println("2.aadhar card");
						System.out.println("3.Driving licence");
						int c=sc1.nextInt();
						if (c==1) {
							ApplyDocuments.applyPan();
						}
						else if (c==2) {
							ApplyDocuments.applyAadhar();
						}
						else if(c==3) {
							ApplyDocuments.applyDrivingLicence();
						}
						else {
							System.out.println("please enter valid option");
						}
						
					}
					else if (b==3) {
						System.out.println("Here all your documents");
					}
					else {
						System.out.println("please enter valid option");
					}
				}
				else {
					System.err.println("Invalid Data");
				}
				sc.close();
			
		 }
		
		
		
	}
}
