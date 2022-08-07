package com.generation.cobaia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.cobaia.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public List <ProdutoModel> findAllByNomesContainingIgnoreCase(@Param("nomes") String nomes);

}
