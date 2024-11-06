package com.voluntariosVall.dana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import objetosBD.VoluntarioLimpieza;

@RestController
@EntityScan(basePackages = "objetosBD")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	VoluntariosValleService service;
	
	@GetMapping("/voluntarios/{coche}")
	public List<VoluntarioLimpieza> getVoluntarioCoche(@PathVariable String coche){
		return service.getVoluntariosCohce(coche);
	}
	
	@PostMapping("/addVoluntario")
	public VoluntarioLimpieza addVoluntario(@RequestBody VoluntarioLimpieza voluntario) {
		return service.addVoluntarioLimpieza(voluntario);
	}
	

}
