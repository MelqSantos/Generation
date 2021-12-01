package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	/* Faz uma Query no banco pra procurar os dados semelhantes a variável título, como o like do SQL */
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
