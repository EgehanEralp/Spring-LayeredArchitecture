package com.egehaneralp.project.dersdbms.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egehaneralp.project.dersdbms.DAL.IDersDal;
import com.egehaneralp.project.dersdbms.Entity.Ders;

@Service
public class DersManager implements IDersService{
	
	private IDersDal dersDal;

	
	public DersManager() {}
	
	@Autowired
	public DersManager(IDersDal dersDal) {
		super();
		this.dersDal = dersDal;
	}

	@Override
	@Transactional
	public List<Ders> getAll() {	
		return dersDal.getAll();
	}

	@Override
	@Transactional
	public void add(Ders ders) {
		dersDal.add(ders);
	}

	@Override
	@Transactional
	public void del(Ders ders) {
		dersDal.del(ders);
	}

	@Override
	@Transactional
	public void update(Ders ders) {
		dersDal.update(ders);
		
	}
	
	
}
