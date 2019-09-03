package jcg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

// Model class.
@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private String skill;

	public Book() { }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}