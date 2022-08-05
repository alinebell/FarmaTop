package com.generation.cobaia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "Categoria é obrigatório!") 
	private String nomeCategoria;
	
	/*@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)*/
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return nomeCategoria;
	}

	public void setCategoria(String categoria) {
		this.nomeCategoria = categoria;
	}

}
