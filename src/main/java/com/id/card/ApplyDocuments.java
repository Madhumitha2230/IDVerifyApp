package com.id.card;

import java.util.Scanner;

public class ApplyDocuments {
	
	public static void application() {
		System.out.println("Enter your details");
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter your Name");
				String a=sc1.next();
		if(a!=null) {
			System.out.println("Please enter your Email ID");
			String b=sc1.next();
			if(b!=null||b.contains("@gmail.com")) {
				System.out.println("enter your phone number");
				String c=sc1.next();
				if(c!=null&&c.length()==10) {
					System.out.println("please enter your address with pincode");
					String d=sc1.next();
					if(d!=null) {
						System.out.println("please enter your parent's name");
						String e=sc1.next();
						if (e!=null) {
							System.out.println("please enter your blood group");
							String f=sc1.next();
							if(f!=null||f.contains("A")||f.contains("B")||f.contains("O")) {
								System.out.println("Application filled succesfully.....Thank you");
							
						}
					}
					
				}
			}
			
		}
		else {
			System.out.println("Invalid data");	
			ApplyDocuments.application();
		}
		}
	}

 public static void applyAadhar() {
	 ApplyDocuments.application();
		 System.out.println("your aadhar card applied successfully it will reach you soon");
	 }
 public static void applyDrivingLicence() {
	 ApplyDocuments.application();
	 System.out.println("your Driving licence applied succesfully You will be get call from RTO office");
 }
public static void applyPan() {
	// TODO Auto-generated method stub
	 ApplyDocuments.application();
	 System.out.println("Your pan card applied successfully it will reach you soon");
}
}
