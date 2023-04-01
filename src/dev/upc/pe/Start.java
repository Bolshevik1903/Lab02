package dev.upc.pe;

public class Start {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Student stud = new Student();
		Teacher doc = new Teacher();
		Worker work = new Worker();
		
		stud.greeting();
		doc.greeting();
		work.greeting();		
	}

}
