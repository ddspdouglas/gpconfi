package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import java.util.Collection;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "armazem")
@AttributeOverride(name = "id", column = @Column(name = "armazem_id", nullable = false))
public class Armazem extends BaseEntityAudit {

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "armazem", targetEntity = Estoque.class, cascade = CascadeType.ALL)
    Collection<Estoque> estoques;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(Collection<Estoque> estoques) {
        this.estoques = estoques;
    }

}
