package objetosBD;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOLUNTARIOS_LIMPIEZA")
public class VoluntarioLimpieza {
	
	@Id
	@GeneratedValue
	private int empId;
	
	@JsonProperty("nombre")
	@Column(name = "nombre")
	private String nombre;
	
	@JsonProperty("apellidos")
	@Column(name = "apellidos")
	private String apellidos;
	
	@JsonProperty("telefono")
	@Column(name = "telefono")
	private String telefono;
	
	@JsonProperty("coche")
	@Column(name = "coche")
	private String coche;

}
