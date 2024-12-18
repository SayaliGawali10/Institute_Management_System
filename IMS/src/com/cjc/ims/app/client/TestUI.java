package com.cjc.ims.app.client;
import java.util.*;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenagar;
public class TestUI {

	

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		Cjc cjc=new Karvenagar();
		
		while(true) {
		
		System.out.println("****MENU****");
		System.out.println("1.AddCourse");
		System.out.println("2.ViewCourse");
		System.out.println("3.AddFaculty");
		System.out.println("4.ViewFaculty");
		System.out.println("5.AddBatch");
		System.out.println("6.ViewBatch");
		System.out.println("7.AddStudent");
		System.out.println("8.ViewStudent");
		
		
		System.out.println("Enter ur Choice");
		int ch=sc.nextInt();
		switch(ch) {
		   
		        case 1:
		    	      cjc.addCourse();
		    	      break;
		    	   
		        case 2:
			    	   cjc.viewCourse(); 
			    	   break;
			    	   
		        case 3:
			    	   cjc.addFaculty();
			    	   break;	
			    	   
		        case 4:
			    	   cjc.viewFaculty();
			    	   break;
			    	   
			    case 5:
				       cjc.addBatch();
				       break;
				    	   
			    case 6:
				      cjc.viewBatch();   
				      break;		   
		        
			    case 7:
			    	   cjc.addStudent();
			    	   break;
			    	   
			    case 8:
				    cjc.viewStudent();
				      break;
				    	   
			    default:
				       System.out.println("Invalid Choice, Please Select Valid Choice");
		}	          	
		}

	}

}
