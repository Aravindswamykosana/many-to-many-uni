package manytomany.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;import com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues;

import lombok.Data;

@Entity
@Data
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double heigth;
	private int age;
	private String status;
	public Hero(String name, double heigth, int age, String status) {
		super();
		this.name = name;
		this.heigth = heigth;
		this.age = age;
		this.status = status;
	}
	public Hero() {
		super();
	}
	@Override
	public String toString() {
		return "\nHero [id=" + id + ", name=" + name + ", heigth=" + heigth + ", age=" + age + ", status=" + status + "]";
	}
	
	
}
