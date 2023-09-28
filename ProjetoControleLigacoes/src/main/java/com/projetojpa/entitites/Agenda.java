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
@Table(name = "tarefa")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@NotBlank
	@Column(name = "ddd")
	private String ddd;
	
	@NotNull
	@NotBlank
	@Column(name = "telefone")
	private String telefone;
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getddd() {
		return ddd;
	}
	
	public void setddd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getelefone() {
		return telefone;
	}
	
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
}
