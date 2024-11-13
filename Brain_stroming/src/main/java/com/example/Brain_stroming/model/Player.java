package com.example.Brain_stroming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Palyers_Table")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Age;
	
	private String name;
	private String currentplayingculb;
	private String StrongFoot;
	private int Goalsscored;
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return Age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the currentplayingculb
	 */
	public String getCurrentplayingculb() {
		return currentplayingculb;
	}
	/**
	 * @return the strongFoot
	 */
	public String getStrongFoot() {
		return StrongFoot;
	}
	/**
	 * @return the goalsscored
	 */
	public int getGoalsscored() {
		return Goalsscored;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer Age) {
		this.Age = Age;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param currentplayingculb the currentplayingculb to set
	 */
	public void setCurrentplayingculb(String currentplayingculb) {
		this.currentplayingculb = currentplayingculb;
	}
	/**
	 * @param strongFoot the strongFoot to set
	 */
	public void setStrongFoot(String StrongFoot) {
		this.StrongFoot = StrongFoot;
	}
	/**
	 * @param goalsscored the goalsscored to set
	 */
	public void setGoalsscored(int Goalsscored) {
		this.Goalsscored = Goalsscored;
	}
	
	
	
	
	
}
