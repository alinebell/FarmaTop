package com.generation.cobaia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "Medicamento é obrigatório!") 
	private String medicamento;
	
	/*@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)*/


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return medicamento;
	}

	public void setCategoria(String medicamento) {
		this.medicamento = medicamento;
	}

}
