package com.voluntariosVall.dana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import objetosBD.VoluntarioLimpieza;

@Service
public class VoluntariosValleService {

	@Autowired
	private VoluntariosVallInterfase interfase;
	
	public List<VoluntarioLimpieza> getVoluntariosCohce(String coche) {
		return interfase.findByCoche(coche);
	}
	
	public VoluntarioLimpieza addVoluntarioLimpieza(VoluntarioLimpieza voluntario) {
		return interfase.save(voluntario);
	}
}
