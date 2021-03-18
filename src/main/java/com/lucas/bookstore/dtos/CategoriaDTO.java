package com.lucas.bookstore.dtos;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.lucas.bookstore.domain.Categoria;

public class CategoriaDTO {

	private Integer id;
	
	@NotBlank(message = "Campo NOME é requerido")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 a 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "Campo DESCRIÇÃO é requerido")
	@Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter entre 3 a 200 caracteres.")
	private String descricao;
	
	public CategoriaDTO() {
		super();
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
