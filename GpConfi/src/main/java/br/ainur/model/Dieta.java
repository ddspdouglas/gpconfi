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
@Table(name = "dieta")
@AttributeOverride(name = "id", column = @Column(name = "dieta_id", nullable = false))
public class Dieta extends BaseEntityAudit {

    @Column(name = "descricao")
    private String descricao;
    @Column(name = "periodo")
    private Double periodo;
    @Column(name = "materi_seca_dia")
    private Double mteriaSecaDia;
    @Column(name = "materia_nat_dia")
    private Double materiaNatDia;
    @Column(name = "ativa")
    private Boolean ativa;
    @OneToMany(mappedBy = "dieta", targetEntity = DietaItem.class, cascade = CascadeType.ALL)
    Collection<DietaItem> itens;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Double periodo) {
        this.periodo = periodo;
    }

    public Double getMteriaSecaDia() {
        return mteriaSecaDia;
    }

    public void setMteriaSecaDia(Double mteriaSecaDia) {
        this.mteriaSecaDia = mteriaSecaDia;
    }

    public Double getMateriaNatDia() {
        return materiaNatDia;
    }

    public void setMateriaNatDia(Double materiaNatDia) {
        this.materiaNatDia = materiaNatDia;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Collection<DietaItem> getItens() {
        return itens;
    }

    public void setItens(Collection<DietaItem> itens) {
        this.itens = itens;
    }
    
    public void setItem(DietaItem item){
        this.itens.add(item);
    }

}
