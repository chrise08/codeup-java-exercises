package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private List<Integer> grades;
	
	public Student (String name) {
		this.name = name;
		this.grades = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Integer> getGrades() {
		return grades;
	}
	
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	public double getGradeAverage() {
		double sum = 0;
		for (Integer grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student("James");
		Student student2 = new Student("Beth");
		
		student1.addGrade(75);
		student1.addGrade(100);
		student1.addGrade(85);
		student1.addGrade(93);
		
		student2.addGrade(99);
		student2.addGrade(85);
		student2.addGrade(100);
		student2.addGrade(105);
		
		System.out.println(student1.getName());
		System.out.println(student1.grades);
		System.out.println(student1.getGradeAverage());
		System.out.println();
		System.out.println(student2.getName());
		System.out.println(student2.grades);
		System.out.println(student2.getGradeAverage());
	}
}
