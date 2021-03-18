package com.lucas.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.bookstore.domain.Categoria;
import com.lucas.bookstore.domain.Livro;
import com.lucas.bookstore.repositories.CategoriaRepository;
import com.lucas.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
	
	Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
	Categoria cat2 = new Categoria(null, "Culinária", "Livros de Culinária");
	Categoria cat3 = new Categoria(null, "Esporte", "Livros de Esporte");
	
	Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
	Livro l2 = new Livro(null, "Culinária Fantástica", "Paolla Carosella", "Receitas fantásticas!", cat2);
	Livro l3 = new Livro(null, "Cozinhando com Jaquin", "Eric Jaquin", "Cozinhando com o Gordão!", cat2);
	Livro l4 = new Livro(null, "MasterCheff", "Henrique Fogaça", "Cheff treta Brasileiro", cat2);
	Livro l5 = new Livro(null, "A lenda!", "Romario Faria", "Tudo sobre a lenda do futebol Brasileiro.", cat3);
	
	cat1.getLivros().addAll(Arrays.asList(l1));
	cat2.getLivros().addAll(Arrays.asList(l2, l3, l4));
	cat3.getLivros().addAll(Arrays.asList(l5));
	
	categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	
	}
}
