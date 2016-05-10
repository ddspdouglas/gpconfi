package br.ainur.model;

import br.ainur.model.base.BaseEntity;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tabela_preco")
@AttributeOverride(name = "id", column = @Column(name = "tab_preco_id", nullable = false))
public class TabelaPreco extends BaseEntity {

    @Column(name = "descricao")
    private String descricao;
    /*@OneToMany (mappedBy = "tabela_preco",targetEntity = TabelaPrecoItem.class,cascade = CascadeType.ALL)
    Collection<TabelaPrecoItem> itens;*/

}
