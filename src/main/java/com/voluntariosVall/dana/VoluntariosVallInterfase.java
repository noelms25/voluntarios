package com.voluntariosVall.dana;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import objetosBD.VoluntarioLimpieza;

public interface VoluntariosVallInterfase extends JpaRepository<VoluntarioLimpieza, Integer> {

	List<VoluntarioLimpieza> findByCoche(String coche);
}
