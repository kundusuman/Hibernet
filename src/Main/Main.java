package Main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Grade;
import model.Student;

public class Main 
{

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("./hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Student student=new Student();
		//student.setId(123);
		student.setName("Gyan");
		Course course=new Course();
		//course.setId(1234);
		course.setCourseName("Java");
		Grade grade=new Grade();
		//grade.setId(12345);
		grade.setGrade("A");
		
		session.persist(course);
		session.persist(student);
		session.persist(grade);
		
		System.out.println(student);
		System.out.println(course);
		System.out.println(grade);
	}

}
