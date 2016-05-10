package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "tabela_preco_item")  
@AttributeOverride(name = "id", column = @Column(name = "tab_preco_itns_id", nullable = false)) 
public class TabelaPrecoItem extends BaseEntityAudit{
    
    @JoinColumn(name = "produto_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Produto produto;
    @JoinColumn(name = "tabela_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TabelaPreco tabela;
    @Column(name = "preco")
    private Double preco;
    
}
