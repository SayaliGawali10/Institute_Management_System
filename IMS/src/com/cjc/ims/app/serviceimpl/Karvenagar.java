package com.cjc.ims.app.serviceimpl;
import java.util.*;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

 
public class Karvenagar implements Cjc {
	
	List<Course> clist=new ArrayList<Course>();
	List<Faculty> flist=new ArrayList<Faculty>();
	List<Batch> blist=new ArrayList<Batch>();
	List<Student> slist=new ArrayList<Student>();
	
	Scanner sc=new Scanner(System.in);

	@Override
	public void addCourse() {
		Course c=new Course();
		
		System.out.println("Enter Course id");
		c.setCid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Course Name");
		c.setCname(sc.nextLine());
		
		
		clist.add(c);
	}

	@Override
	public void viewCourse() {
		System.out.println("*****");
		for(Course c: clist) {
	    System.out.println("Course ID- "+c.getCid()+ " Course Name- "+c.getCname());
		}
		System.out.println("*****");
	}

	@Override
	public void addFaculty(){
		Faculty f=new Faculty();
		
		System.out.println("Enter faculty id");
		f.setFid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter faculty name");
		f.setFname(sc.nextLine());
		
		
		System.out.println("Assign any one course to Faculty");
		viewCourse();
	    System.out.println("Enter Course ID");
		     int cid=sc.nextInt();
		     
		     
		  boolean courseFound=false;   
		    for(Course course: clist) {
		     if(cid==course.getCid()) {
		    	 f.setCourse(course);
		    	 courseFound=true;
		    	 System.out.println("Added Course Successfully to Faculty");
		    	 break;
		    	 
		     }
		    }
		     if (courseFound!=true) {
		         try {
		             
		        	 throw new IDNotFoundException("Invalid Course ID");
		         } 
		         
		         catch (IDNotFoundException e) {
		             System.out.println(e.getMessage());
		         }
		     
		     }
		       flist.add(f); 
		     }
	
	
	@Override
	public void viewFaculty() {
		     System.out.println("*****");
	         for(Faculty f: flist) {
	         System.out.println("Faculty ID- "+f.getFid()+ " Faculty Name- "+f.getFname());   	 
	        	 
	         }
	         System.out.println("*****");
	}

	@Override
	public void addBatch() {
		Batch b=new Batch();
		
		System.out.println("Enter Batch id");
		b.setBid(sc.nextInt());
		
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		
		
		System.out.println("Assign any one faculty to Batch");
		viewFaculty();
		System.out.println("Enter Faculty ID");
		 int fid=sc.nextInt();
		 
		 boolean courseFound=false;   
		 for(Faculty faculty:flist) {
			 
			 if(fid==faculty.getFid()) {
				b.setFaculty(faculty);
				courseFound=true;
				System.out.println("Added Faculty Successfully to Batch");
				break;
			 }
		 }
			 if(courseFound!=true) {
		    	 try {
		    		 throw new IDNotFoundException ("Invalid Faculty ID");
		    	 }
		    	 catch(IDNotFoundException e){
		    		 
		    		 System.out.println(e.getMessage());
		    	 }
			 
			 }
			 
		    blist.add(b);  
	}

	@Override
	public void viewBatch() {
		System.out.println("*****");
		for(Batch b: blist) {
		     System.out.println("Batch ID- "+b.getBid()+ " Batch Name- "+b.getBname());   	 
		        	 
		         }
		System.out.println("*****");
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		
		System.out.println("Enter Student id");
		s.setSid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Student Name");
		s.setSname(sc.nextLine());
		
		
		System.out.println("Assign any one batch to Student");
		viewBatch();
		System.out.println("Enter Batch ID");
		 int bid=sc.nextInt();
		 
		 boolean courseFound=false;   
		    for(Batch batch:blist) {
		    	if(bid==batch.getBid()) {
		    		s.setBatch(batch);
		    		courseFound=true;
		    		System.out.println("Added Batch Successfully to Student");
		    		break;
		    	}
		    }
		    	if(courseFound!=true) {
			    	 try {
			    		 throw new IDNotFoundException ("Invalid Batch ID");
			    	 }
			    	 catch(IDNotFoundException e){
			    		 
			    		 System.out.println(e.getMessage());
			    	 }
		    }
		    
		         
		    slist.add(s); 
	}

	@Override
	public void viewStudent() {
		System.out.println("*****");
		for(Student s: slist) {
		     System.out.println("Student ID- "+s.getSid()+ " Student Name- "+s.getSname());   	 
		        	 
		         }
		System.out.println("*****");
	}
	
	
	

}
