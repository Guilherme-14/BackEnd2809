package com.projetojpa.entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ligacao")
public class Ligacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(name = "data")
	private String data;
	
	@NotNull
	@NotBlank
	@Column(name = "horarioInicio")
	private String horarioInicio;
	
	@NotNull
	@NotBlank
	@Column(name = "horarioFinal")
	private String horarioFinal;
	
	@NotNull
	@NotBlank
	@Column(name = "telefoneDiscado")
	private String telefoneDiscado;
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	
	public String getdata() {
		return data;
	}
	
	public void setdata(String data) {
		this.data = data;
	}
	
	public String gethorarioInicio() {
		return horarioInicio;
	}
	
	public void sethorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	
	public String gethorarioFinal() {
		return horarioFinal;
	}
	
	public void sethorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	
	public String gettelefoneDiscado() {
		return telefoneDiscado;
	}
	
	public void settelefoneDiscado(String telefoneDiscado) {
		this.telefoneDiscado = telefoneDiscado;
	}
}
