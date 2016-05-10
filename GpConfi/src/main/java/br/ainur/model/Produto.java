package br.ainur.model;

import br.ainur.model.base.BaseEntityAudit;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@AttributeOverride(name = "id", column = @Column(name = "produto_id", nullable = false))
public class Produto extends BaseEntityAudit {

    @Column(name = "descricao")
    private String descricao;
    @Column(name = "materia_seca")
    private Double materiaSeca;
    @OneToMany(mappedBy = "produto", targetEntity = Estoque.class, cascade = CascadeType.ALL)
    List<Estoque> estoque;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getMateriaSeca() {
        return materiaSeca;
    }

    public void setMateriaSeca(Double materiaSeca) {
        this.materiaSeca = materiaSeca;
    }

    public List<Estoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Estoque> estoque) {
        this.estoque = estoque;
    }
    
    public void setEstoqueItem(Estoque estoque){
        this.estoque.add(estoque);
    }

}
