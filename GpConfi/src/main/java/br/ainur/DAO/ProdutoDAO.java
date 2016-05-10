package br.ainur.DAO;

import br.ainur.model.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Integer> {

    public ProdutoDAO() {
        super(Produto.class);
    }
    
}
