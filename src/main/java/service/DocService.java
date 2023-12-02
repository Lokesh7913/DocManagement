package service;

import java.util.List;

import model.Doctor;

public class DocService {
	
	public void addDoctor(Doctor doctor) {
		System.out.println("ADD doctor of service class in");
		System.out.println("Yes, Doctor is added to database..!!");
		System.out.println("add doctor of service class out");
	}
	public void deleteDoc(Doctor doctor) {
		System.out.println("Delete doctor of service class in");
		System.out.println("Delete doctor is done...!!!");
		System.out.println("Delete doctor of service class out");
	}
	public void modifyDoc(Doctor doctor) {
		System.out.println("Modify doctor of service class in");
		System.out.println("doctor modifiction done..!!!");
		System.out.println("Modify doctor of service class out");
	}
	public void bulkAddDoc(List<Doctor> doctor) {
		System.out.println("BulkADD doctor of service Class in");
		System.out.println("Bulk Add is Done...!!!");
		System.out.println("BulkADD doctor of service class out");
	}

}
