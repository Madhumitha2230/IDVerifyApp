package com.id.card;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Scanner;

public class UploadDocuments {
	
	public static void aadhar() throws Exception{
		System.out.println("Please enter your aadhar num");
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		if(A==null||A.length()!=12) {
			System.out.println("Please enter valid aadhar number");
		}
		else {
			System.out.println("Your aadhar card uploaded successfully");
		
		}
	}
	
	public static void panCard()throws Exception{
		System.out.println("please enter your pan number");
		Scanner sc=new Scanner(System.in);
		String P=sc.next();
		
		if(P!=null&&(P.length()==10)) {
			System.out.println("Your pan card uploaded successfully");
		}
		else {
			System.out.println("Please enter valid pan card number");
		}
	}
	
	public static void drivingLicence()throws Exception{
		System.out.println("Please enter your driving license");
		Scanner sc=new Scanner(System.in);
		String DL=sc.next();
		
		if(DL!=null&&DL.length()==16) {
			System.out.println("Your driving licence uploaded successfully");
		}
		else {
			System.out.println("please enter valid driving licence number");
		}
		System.out.println("All cards uploaded Successfully");
	}
}
