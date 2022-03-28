package com.id.regLogin;
import java.util.Scanner;
import java.util.*;
import com.id.card.UploadDocuments;
import com.id.regLogin.Register;
	public class Home {
	public static void main(String[] args) throws Exception {
		
			
			System.out.println("Welcome");
			System.out.println("1) New User");
			System.out.println("2) Existing User");
			
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			
			
			if (a==1) {
				System.out.println("Enter the details to register");
				RegisterValidation.userRegister();
			}
			
			else if (a==2) {
				System.out.println("Enter the details to Login");
				Login.login();
			}			
			
			else {
				System.out.println("please enter valid Option");
			}
			
		}
	}