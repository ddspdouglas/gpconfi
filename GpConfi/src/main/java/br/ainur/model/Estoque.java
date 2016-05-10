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
@Table(name = "estoque")  
@AttributeOverride(name = "id", column = @Column(name = "estoque_id", nullable = false)) 
public class Estoque extends BaseEntityAudit{
    
    @JoinColumn(name = "produto_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Produto produto;
    @Column(name = "quantidade")
    private Double quantidade;
    @Column(name = "custo")
    private Double custo;
    @JoinColumn(name = "armazem_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Armazem armazem;
    
}
