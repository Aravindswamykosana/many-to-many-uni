package manytomany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double budget;
	private String director;
	private String releaseDate;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Hero>hero;
	public Movie(String name, double budget, String director, String releaseDate, List<Hero> hero) {
		super();
		this.name = name;
		this.budget = budget;
		this.director = director;
		this.releaseDate = releaseDate;
		this.hero = hero;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "\nMovie [id=" + id + ", name=" + name + ", budget=" + budget + ", director=" + director + ", releaseDate="
				+ releaseDate + ", hero=" + hero + "]";
	}
	
}
