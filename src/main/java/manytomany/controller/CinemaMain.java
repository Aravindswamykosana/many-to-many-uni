package manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany.dto.Hero;
import manytomany.dto.Movie;

public class CinemaMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("arvind");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hero hero=new Hero("prabhas", 6.3, 46, "single");
		Hero hero1=new Hero("rana", 6.5, 48, "married");
		Hero hero2=new Hero("prudhviraj", 6, 45, "married");
		Hero hero3=new Hero("pa1kalyan",5.9, 52, "married");
		
		List<Hero> li=new ArrayList<Hero>();
		li.add(hero);
		li.add(hero2);
		Movie movie=new Movie("salaar",40000000, "neel", "2023", li);
		System.out.println(movie);
		
		List<Hero> li1=new ArrayList<Hero>();
		li1.add(hero);
		li1.add(hero1);
		Movie movie1=new Movie("bahubali",70000000, "rajamouli", "2020", li1);
		System.out.println(movie1);
		
		List<Hero> li2=new ArrayList<Hero>();
		li2.add(hero);
		Movie movie2=new Movie("darling",20000000, "karnakar", "2016", li2);
		System.out.println(movie2);
		
		List<Hero> li3=new ArrayList<Hero>();
		li3.add(hero3);
		li3.add(hero1);
		Movie movie3=new Movie("bheemlanayak",30000000, "sagar", "2021", li3);
		System.out.println(movie3);
		
		et.begin();
		em.persist(movie);
		em.persist(movie1);
		em.persist(movie2);
		em.persist(movie3);
		et.commit();
	}
}
