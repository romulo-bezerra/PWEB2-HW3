package br.edu.ifpb.supermercado.repository;

import br.edu.ifpb.supermercado.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
