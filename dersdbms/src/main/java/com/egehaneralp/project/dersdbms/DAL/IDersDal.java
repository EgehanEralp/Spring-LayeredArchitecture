package com.egehaneralp.project.dersdbms.DAL;

import java.util.List;

import com.egehaneralp.project.dersdbms.Entity.Ders;

public interface IDersDal {

	public List<Ders> getAll();
	public void add(Ders ders);
	public void del(Ders ders);
	public void update(Ders ders);
	
	
	
}
