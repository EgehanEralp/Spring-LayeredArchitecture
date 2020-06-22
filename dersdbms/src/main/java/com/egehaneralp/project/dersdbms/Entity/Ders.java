package com.egehaneralp.project.dersdbms.Entity;

import javax.persistence.*;

@Entity
@Table(name="Ders")
public class Ders {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="tid")
	private int tid;
	
	@Column(name="credit")
	private int credit;
	
	
	public Ders(int id, String name, int tid, int credit) {
		this.id = id;
		this.name = name;
		this.tid = tid;
		this.credit = credit;
	}
	
	public Ders() {//default constructor
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return name;
	}
	public void setNameString(String nameString) {
		this.name = nameString;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	

}
