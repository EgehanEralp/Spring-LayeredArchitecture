package com.egehaneralp.project.dersdbms.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egehaneralp.project.dersdbms.Business.IDersService;
import com.egehaneralp.project.dersdbms.Entity.Ders;

@RestController
@RequestMapping("/api")
public class DersController {
	
	IDersService dersService;

	@Autowired
	public DersController(IDersService dersService) {
		super();
		this.dersService = dersService;
	}
	
	@GetMapping("/dersler")
	public List<Ders> go(){
		return dersService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Ders ders) {
		dersService.add(ders);
	}
	
	@PostMapping("/del")
	public void del(@RequestBody Ders ders) {
		dersService.del(ders);
	}

	@PostMapping("/update")
	public void up(@RequestBody Ders ders) {
		dersService.update(ders);
	}
}
