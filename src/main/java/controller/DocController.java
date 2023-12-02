package controller;

import java.util.List;

import model.Doctor;
import service.DocService;


public class DocController {

	DocService docService = new DocService();

	public static void main(String... args) {
		System.out.println("I am in main method");
		Doctor abhishek = new Doctor();
		abhishek.setcontactNumber(9999384354l);
		DocController controller= new DocController();
		
		controller.addDoc(abhishek);
		
		controller.deleteDoc(null);
		
		controller.modifyDoc(abhishek);
		
		controller.bulkAddDoc(null);
		
		System.out.println("main method out");

	}
	private void addDoc(Doctor d) {
		System.out.println("add doctor of main class in");
		docService.addDoctor(d);
		System.out.println("add doctor of main class out");
	}

	private void deleteDoc(Doctor d) {
		docService.deleteDoc(d);

	}

	private void modifyDoc(Doctor d) {
		docService.modifyDoc(d);
	}

	private void bulkAddDoc(List<Doctor> d) {		
		docService.bulkAddDoc(d);
	}

}
