package br.edu.ifpb.supermercado.web;

import br.edu.ifpb.supermercado.domain.Produto;
import br.edu.ifpb.supermercado.service.ProdutoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getTodos() {
        return ResponseEntity.ok().body(produtoService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok().body(produtoService.salvarProduto(produto));
    }

}
