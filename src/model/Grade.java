package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grade 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String grade;
	@Column 
	private long course;
	@Column
	private long student;
	public long getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString()
	{
		return "Grade [id=" + id + ", grade=" + grade + "]";
	}
}
