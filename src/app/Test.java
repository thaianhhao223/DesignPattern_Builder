package app;

import entity.Computer;
import entity.Student;

public class Test {
	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and
		//without any inconsistent state or arguments management issues
		System.out.println("Computer builder ==========================================");
		Computer comp1 = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp1.toString());
		Computer comp2 = new Computer.ComputerBuilder("1 TB", "32 GB").setGraphicsCardEnabled(true).build();
		System.out.println(comp2.toString());
		System.out.println("Student builder ==========================================");
		Student student1 = new Student.StudentBuilder("001", "John", "6-9", 16, "male").setAddress("Houston").setFathername("Alvin").Build();
		System.out.println(student1.toString());
		Student student2 = new Student.StudentBuilder("002", "Judy", "3-5", 13, "female").setAddress("Washington").setFathername("David")
				.setMothername("Promise").setNationality("Canada").Build();
		System.out.println(student2.toString());
	}
}
